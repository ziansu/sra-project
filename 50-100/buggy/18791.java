public void onEnable() {
    le.mysquishyturt.permissions.Permissions.instance = this;
    configHandler = le.mysquishyturt.permissions.configHandler.ConfigHandler.getInstance();
    getConfig().options().copyDefaults(true);
    saveConfig();
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new le.mysquishyturt.permissions.playerListener.PlayerListener(), this);
    configHandler.loadGroups();
    configHandler.loadAllPlayers();
    getLogger().info("Permissions loaded.");
}