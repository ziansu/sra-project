private static int initIntValue(java.util.Properties properties, java.lang.String property, int defaultValue) {
    if ((properties == null) || ((properties.get(property)) == null)) {
        return defaultValue;
    }
    java.lang.String value = properties.getProperty(property);
    try {
        return java.lang.Integer.parseInt(value);
    } catch (java.lang.NumberFormatException e) {
        throw BootstrapLogger.LOG.invalidThreadPoolSize(value);
    }
}