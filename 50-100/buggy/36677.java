@java.lang.Override
public java.lang.Integer getInteger(java.lang.String key, java.lang.Integer defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound(defaultValue);
    
    try {
        return java.lang.Integer.parseInt(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(e, defaultValue);
    }
}