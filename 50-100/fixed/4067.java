public void deleteConfig(java.lang.String configName) {
    if (configs.containsKey(configName))
        configs.remove(configName);
    
    java.io.File f = new java.io.File(getDataFolder(), (configName + ".yml"));
    if (f.exists())
        f.delete();
    
}