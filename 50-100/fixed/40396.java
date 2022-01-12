@java.lang.Override
public java.lang.Integer getInteger(java.lang.String key) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound();
    
    try {
        return java.lang.Integer.parseInt(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(key, value, e);
    }
}