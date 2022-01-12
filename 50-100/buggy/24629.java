public java.lang.String getString(java.lang.String path, org.bukkit.World world) {
    java.io.File worldConfig = new java.io.File(plugin.getDataFolder(), ((world.getName()) + "_config.yml"));
    com.feildmaster.lib.configuration.EnhancedConfiguration config = new com.feildmaster.lib.configuration.EnhancedConfiguration(worldConfig, plugin);
    java.lang.String value = null;
    if (config.getString(path).equalsIgnoreCase("global")) {
        value = config.getString(path);
    }else {
        value = plugin.getConfig().getString(path);
    }
    return value;
}