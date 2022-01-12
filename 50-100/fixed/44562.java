private java.util.Map<java.lang.String, java.util.Properties> getAllPropertiesFiles() {
    java.util.Map<java.lang.String, java.util.Properties> properties = new java.util.HashMap<java.lang.String, java.util.Properties>();
    for (java.lang.String path : getPropertiesFiles()) {
        if (isValidPath(path)) {
            properties.put(getClassPathFromProperties(path), loadProperties(path));
        }
    }
    return properties;
}