private void setConfigFile(java.lang.String filePath, java.lang.String configDirDest, java.lang.String configFileDestName) {
    org.codehaus.cargo.container.configuration.LocalConfiguration config = getConfiguration();
    org.codehaus.cargo.container.configuration.FileConfig configFile = new org.codehaus.cargo.container.configuration.FileConfig();
    configFile.setFile(filePath);
    configFile.setToDir(configDirDest);
    configFile.setToFile(configFileDestName);
    config.setConfigFileProperty(configFile);
    getContainer().setConfiguration(config);
}