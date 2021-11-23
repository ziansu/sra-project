public java.lang.String getLastOpenFilePath() throws java.io.IOException {
    java.lang.String fileContent = configurationFile.readFile();
    storage.ConfigurationFileOperation.logger.info(storage.ConfigurationFileOperation.MESSAGE_READ_CONFIGURATION_FILE);
    try {
        java.lang.String filePath = converter.getFilePathFromJsonString(fileContent);
        if ((isNull(filePath)) || (filePath.equals(storage.ConfigurationFileOperation.EMPTY_STRING))) {
            filePath = storage.ConfigurationFileOperation.DEFAULT_FILE_NAME;
        }
        return filePath;
    } catch (java.lang.Exception e) {
        storage.ConfigurationFileOperation.logger.info(storage.ConfigurationFileOperation.MESSAGE_CONFIGURATION_CANNOT_PARSE);
        return storage.ConfigurationFileOperation.DEFAULT_FILE_NAME;
    }
}