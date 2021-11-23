public org.bukkit.configuration.file.FileConfiguration getData(java.lang.String uuid) {
    java.io.File dFile = getPlayerFile(uuid);
    org.bukkit.configuration.file.FileConfiguration data = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(dFile);
    return data;
}