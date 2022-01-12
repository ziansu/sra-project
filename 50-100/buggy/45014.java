static java.util.Properties getIniConfiguration(java.lang.String configFilePath) {
    java.util.Properties prop = new java.util.Properties();
    java.io.InputStream inputStream;
    try {
        inputStream = new java.io.FileInputStream(configFilePath);
        prop.load(inputStream);
    } catch (java.io.IOException e) {
        io.dockstore.client.cli.ExceptionHelper.errorMessage(io.dockstore.client.cli.ConfigFileHelper.LOGGER, e.getMessage(), io.dockstore.client.cli.ExceptionHelper.IO_ERROR);
    }
    return prop;
}