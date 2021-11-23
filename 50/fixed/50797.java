public java.lang.String loadProperty(java.lang.String name) {
    java.util.Properties properties = loadOverriddenConfigurationProperties();
    java.lang.String value = properties.getProperty(name);
    return value;
}