public java.math.BigDecimal getDecimal(java.lang.String index, java.math.BigDecimal defaultVal) {
    java.lang.Object value = getter(index);
    java.math.BigDecimal results = defaultVal;
    try {
        results = new java.math.BigDecimal(value.toString());
    } catch (java.lang.Exception e) {
    }
    return results;
}