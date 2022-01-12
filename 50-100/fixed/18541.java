public static org.bukkit.configuration.file.FileConfiguration loadSignDataInto(java.io.File dataFolder, java.lang.String fileName, org.bukkit.configuration.file.FileConfiguration signDataConfig) {
    java.io.File signFile = new java.io.File(dataFolder, fileName);
    if (!(signFile.exists())) {
        try {
            signFile.createNewFile();
            return org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(signFile);
        } catch (java.io.IOException e) {
            return new org.bukkit.configuration.file.YamlConfiguration();
        }
    }else {
        return org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(signFile);
    }
}