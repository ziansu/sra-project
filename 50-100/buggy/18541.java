public static void loadSignDataInto(java.io.File dataFolder, java.lang.String fileName, org.bukkit.configuration.file.FileConfiguration signDataConfig) {
    java.io.File signFile = new java.io.File(dataFolder, fileName);
    if (!(signFile.exists())) {
        try {
            signFile.createNewFile();
            signDataConfig = org.bukkit.configuration.file.YamlConfiguration.loadConfiguration(signFile);
        } catch (java.io.IOException e) {
            signDataConfig = new org.bukkit.configuration.file.YamlConfiguration();
        }
    }
}