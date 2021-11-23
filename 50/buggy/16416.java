private java.lang.String getOrDefault(java.util.Map config, java.lang.String name, java.lang.String defaultValue) {
    java.lang.String value = config.get(name).toString();
    if (value == null) {
        return defaultValue;
    }
    return value;
}