public java.util.ArrayList<java.lang.String> getHistoryFilePath() {
    try {
        java.lang.String fileContent = configurationFile.readFile();
        storage.ConfigurationFileOperation.logger.info(storage.ConfigurationFileOperation.MESSAGE_READ_CONFIGURATION_FILE);
        java.util.ArrayList<java.lang.String> x = converter.getFilePathListFromJsonString(fileContent);
        return x;
    } catch (java.lang.Exception e) {
        java.util.ArrayList<java.lang.String> x = new java.util.ArrayList<java.lang.String>();
        x.add(storage.ConfigurationFileOperation.DEFAULT_FILE_NAME);
        return x;
    }
}