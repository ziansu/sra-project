public boolean worldUnloaded(java.lang.String name) {
    return (!(worldExists(name))) && (org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(configFileWM).contains(name));
}