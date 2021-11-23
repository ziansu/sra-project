@java.lang.Override
public java.lang.Double getDouble(java.lang.String key) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound();
    
    try {
        return java.lang.Double.parseDouble(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(e);
    }
}