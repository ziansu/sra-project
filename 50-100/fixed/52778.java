public cs2103_w09_1j.esther.Config readConfigFile(java.nio.file.Path filePath) throws java.io.IOException, java.text.ParseException {
    Storage.storageLogger.info("Checking if config file is valid");
    if (isValidFile(Storage.configPath)) {
        Storage.storageLogger.info("File Valid. Proceeding to load");
        return loadConfigFile(Storage.configPath);
    }else {
        Storage.storageLogger.warning("File Invalid. Using default config");
        cs2103_w09_1j.esther.Config defaultConfig = new cs2103_w09_1j.esther.Config();
        writeConfigFile(defaultConfig);
        return defaultConfig;
    }
}