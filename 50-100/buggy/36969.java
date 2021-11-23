@java.lang.Override
public java.lang.Float getFloat(java.lang.String key, java.lang.Float defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound();
    
    try {
        return java.lang.Float.parseFloat(value);
    } catch (java.lang.NumberFormatException e) {
        return parseError(e);
    }
}