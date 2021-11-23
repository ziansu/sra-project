private java.lang.String getFileDirectoryFromProperties(java.lang.String key) {
    java.util.Properties storageProperties = storageLoad.loadProperties();
    java.lang.String fileDir = storageProperties.getProperty(key);
    fileDir = getFileDirectory(fileDir);
    return fileDir;
}