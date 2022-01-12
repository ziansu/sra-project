public java.lang.Object getAttribute(java.lang.String name, java.lang.Object defaultValue) {
    if (name == null) {
        return null;
    }
    if (defaultValue == null) {
        throw new java.lang.NullPointerException("the default value may not be null");
    }
    java.lang.Object result = attributes.putIfAbsent(name, defaultValue);
    if (result == null) {
        result = defaultValue;
    }
    return result;
}