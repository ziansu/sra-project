public void setupProxyProperties(java.util.Map<java.lang.String, java.lang.String> properties) {
    java.util.Map<java.lang.String, java.lang.String> environment = getEnvironment();
    if (environment.containsKey(Config.HTTP_PROXY)) {
        properties.put(Config.HTTP_PROXY, environment.get(Config.HTTP_PROXY));
    }
    if (environment.containsKey(Config.HTTPS_PROXY)) {
        properties.put(Config.HTTPS_PROXY, environment.get(Config.HTTPS_PROXY));
    }
}