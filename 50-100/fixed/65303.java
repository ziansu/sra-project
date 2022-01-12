@java.lang.Override
protected java.lang.Object handleGetObject(java.lang.String key) {
    java.lang.Object object = propertyBundle.handleGetObject(key);
    if (object instanceof java.lang.String) {
        java.lang.String string = ((java.lang.String) (object));
        return new java.lang.String(string.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
    }
    return object;
}