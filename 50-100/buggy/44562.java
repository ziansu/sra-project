private java.util.Map<java.lang.String, java.util.Properties> getAllPropertiesFiles() {
    java.util.Map<java.lang.String, java.util.Properties> properties = new java.util.HashMap<java.lang.String, java.util.Properties>();
    for (java.lang.String path : getPropertiesFiles()) {
        if (isValidPath(path)) {
            java.lang.String realPath = java.lang.ClassLoader.getSystemResource(path).getPath();
            properties.put(getClassPathFromProperties(path), loadProperties(realPath));
        }
    }
    return properties;
}