@java.lang.Override
public java.lang.Short getShort(java.lang.String key) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound();
    
    try {
        return java.lang.Short.parseShort(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(e);
    }
}