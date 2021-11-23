private int getInteger(java.lang.String propertyName, int defaultValue) {
    com.hazelcast.config.Config config = nodeEngine.getConfig();
    java.lang.String property = config.getProperty(propertyName);
    return property == null ? defaultValue : java.lang.Integer.parseInt(property);
}