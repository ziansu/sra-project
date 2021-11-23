@java.lang.Override
public void onEnable() {
    le.mysquishyturt.permissions.Permissions.instance = this;
    configHandler = le.mysquishyturt.permissions.configHandler.ConfigHandler.getInstance();
    getConfig().options().copyDefaults(true);
    saveConfig();
    configHandler.loadGroups();
    configHandler.loadAllPlayers();
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new le.mysquishyturt.permissions.playerListener.PlayerListener(), this);
    getLogger().info("Permissions loaded.");
}