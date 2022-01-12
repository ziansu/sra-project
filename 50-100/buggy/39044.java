public boolean getBoolean(java.lang.String path, org.bukkit.World world) {
    java.io.File worldConfig = new java.io.File(plugin.getDataFolder(), ((world.getName()) + "_config.yml"));
    com.feildmaster.lib.configuration.EnhancedConfiguration config = new com.feildmaster.lib.configuration.EnhancedConfiguration(worldConfig, plugin);
    boolean value = false;
    if (config.getString(path).equalsIgnoreCase("global")) {
        value = config.getBoolean(path);
    }else {
        value = plugin.getConfig().getBoolean(path);
    }
    return value;
}