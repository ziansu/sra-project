private boolean loadConfig() {
    if (!(configFile.exists())) {
        plugin.getLogger().info("No config found. Create new one ...");
        newConfig();
    }else {
        try {
            config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(configFile);
            updateConfig();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            config = null;
        }
    }
    return (config) != null;
}