private java.util.Map<java.lang.String, java.lang.Object> loadPolyfills(java.util.List<java.nio.file.Path> polyfillPaths) {
    java.util.Map<java.lang.String, java.lang.Object> polyfills = new java.util.HashMap<>();
    for (java.nio.file.Path polyfillPath : polyfillPaths) {
        java.util.Map<java.lang.String, java.lang.Object> featureConfigs = loadConfig(polyfillPath);
        java.lang.String key = getPolyfillKey(polyfillPath.toString());
        if (featureConfigs != null) {
            polyfills.put(key, featureConfigs);
        }
    }
    return polyfills;
}