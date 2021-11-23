private java.lang.String getOrDefault(java.util.Map config, java.lang.String name, java.lang.String defaultValue) {
    java.lang.Object value = config.get(name);
    if (value == null) {
        return defaultValue;
    }else {
        return value.toString();
    }
}