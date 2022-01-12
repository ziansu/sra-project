private static void overrideFromSystemProperties(java.util.Properties properties) {
    properties.stringPropertyNames().forEach(( key) -> {
        java.lang.String systemProperty = java.lang.System.getProperty(key);
        if (org.apache.commons.lang3.StringUtils.isNotBlank(systemProperty)) {
            properties.setProperty(key, systemProperty);
        }
    });
}