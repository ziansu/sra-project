private void loadProperties() {
    try {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(org.fundacionjala.pivotal.util.Environment.CONFIG_PROPERTIES);
        properties = new java.util.Properties();
        properties.load(fileInputStream);
        fileInputStream.close();
    } catch (java.io.FileNotFoundException e) {
        org.fundacionjala.pivotal.util.Environment.LOGGER.warn("The properties file couldn't be found", e);
    } catch (java.io.IOException e) {
        org.fundacionjala.pivotal.util.Environment.LOGGER.warn("A problem of type", e);
    }
}