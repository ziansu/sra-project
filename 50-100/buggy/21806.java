private boolean loadConfig() {
    java.io.File file = new java.io.File(plugin.getDataFolder(), CONFIG_PATH);
    if (!(file.exists())) {
        plugin.getLogger().info("No config found. Create new one ...");
        newConfig(file);
    }else {
        try {
            config = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(file);
            updateConfig(file);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            config = null;
        }
    }
    return (config) != null;
}