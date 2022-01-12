public java.lang.String getString(java.lang.String key) {
    java.lang.String value = envMap.get(key);
    return null != value ? value.trim() : null;
}