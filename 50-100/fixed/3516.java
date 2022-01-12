@java.lang.Override
public java.lang.Short getShort(java.lang.String key, java.lang.Short defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound(defaultValue);
    
    try {
        return java.lang.Short.parseShort(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(key, value, e);
    }
}