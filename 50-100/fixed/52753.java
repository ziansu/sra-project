private java.lang.String getConfigurationAbsolutePath(java.lang.String path) {
    java.io.File configFile = new java.io.File(path, configurationFileName);
    if (configFile.exists()) {
        return configFile.getAbsolutePath();
    }
    InternalLogger.INSTANCE.logAlways(InternalLogger.LoggingLevel.INFO, "Did not find configuration file '%s' in '%s'", configurationFileName, path);
    return null;
}