protected java.util.Properties mergeProperties() throws java.io.IOException {
    java.util.Properties result = new java.util.Properties();
    com.navercorp.pinpoint.common.util.ConfigCenterLoader configCenterLoader = new com.navercorp.pinpoint.common.util.ConfigCenterLoader();
    java.util.Properties properties = configCenterLoader.loader();
    com.navercorp.pinpoint.common.util.ConfigCenterLoader.overrideProperies(properties, result);
    return result;
}