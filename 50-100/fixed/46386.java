private java.util.Properties loadConfig(java.lang.String file) {
    java.util.Properties config = new java.util.Properties();
    try (java.io.InputStream fis = new java.io.FileInputStream(file)) {
        config.load(fis);
    } catch (java.lang.Exception e) {
        return null;
    }
    return config;
}