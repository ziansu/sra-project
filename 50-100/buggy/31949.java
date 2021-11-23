private boolean loadConfig() {
    configFile = new java.io.File(plugin.getDataFolder(), CONFIG_PATH);
    if (!(configFile.exists())) {
        plugin.getLogger().info("No config found. Create new one ...");
        newConfig();
    }
    try {
        config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(configFile);
        updateConfig();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        config = null;
    }
    return (config) != null;
}