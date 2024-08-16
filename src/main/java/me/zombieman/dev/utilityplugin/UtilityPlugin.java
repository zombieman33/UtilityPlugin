package me.zombieman.dev.utilityplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class UtilityPlugin extends JavaPlugin {

    private static UtilityPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static UtilityPlugin getInstance() {
        return instance;
    }

    public void scheduleCommand(String command, long delayTicks) {
        Bukkit.getScheduler().runTaskLater(this, () -> {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }, delayTicks);
    }
}
