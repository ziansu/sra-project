private static java.lang.String getPropertyInternal(java.lang.String propKey, java.lang.String propFile) {
    try (java.io.InputStream input = new java.io.FileInputStream(propFile)) {
        java.util.Properties prop = new java.util.Properties();
        prop.load(input);
        return prop.getProperty(propKey).trim();
    } catch (java.io.IOException ex) {
        utils.Props.log.error(ex);
        throw new java.lang.RuntimeException(("value not found for key: " + propKey));
    }
}