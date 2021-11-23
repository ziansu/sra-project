public java.lang.String getProperty(java.lang.String key) {
    if ("".equals(key)) {
        throw new java.lang.IllegalArgumentException("Key must not be null");
    }
    return properties.get(key);
}