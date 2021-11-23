@java.lang.Override
public java.lang.Double getDouble(java.lang.String key, java.lang.Double defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound(defaultValue);
    
    try {
        return java.lang.Double.parseDouble(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(key, value, e);
    }
}