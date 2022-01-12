public static java.util.Properties loadProperties(java.lang.String propertiesFile) {
    java.util.Properties props = new java.util.Properties();
    try (java.io.InputStream input = oshi.json.util.PropertiesUtil.class.getClassLoader().getResourceAsStream(propertiesFile)) {
        if (input == null) {
            oshi.json.util.PropertiesUtil.LOG.error("No properties file {} on the classpath.", propertiesFile);
            return props;
        }
        props.load(input);
        oshi.json.util.PropertiesUtil.LOG.debug("Loaded properties: {}", props.toString());
    } catch (java.io.IOException ex) {
        oshi.json.util.PropertiesUtil.LOG.error("Error reading properties file {}.", propertiesFile);
    }
    return props;
}