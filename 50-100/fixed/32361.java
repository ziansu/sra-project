private static long initLongValue(java.util.Properties properties, java.lang.String property, long defaultValue) {
    if ((properties == null) || ((properties.get(property)) == null)) {
        return defaultValue;
    }
    java.lang.String value = properties.getProperty(property);
    try {
        return java.lang.Long.parseLong(value);
    } catch (java.lang.NumberFormatException e) {
        throw BootstrapLogger.LOG.invalidPropertyValue(property, value);
    }
}