@java.lang.Override
public java.math.BigDecimal getBigDecimal(java.lang.String key, java.math.BigDecimal defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound(defaultValue);
    
    try {
        return java.math.BigDecimal.valueOf(java.lang.Long.valueOf(value));
    } catch (java.lang.NumberFormatException e) {
        return parseError(key, value, e);
    }
}