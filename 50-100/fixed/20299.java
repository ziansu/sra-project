@java.lang.Override
public java.math.BigInteger getBigInteger(java.lang.String key, java.math.BigInteger defaultValue) {
    java.lang.String value = getString(key);
    if (value == null)
        return notFound(defaultValue);
    
    try {
        return java.math.BigInteger.valueOf(java.lang.Long.valueOf(value));
    } catch (java.lang.NumberFormatException e) {
        return parseError(key, value, e);
    }
}