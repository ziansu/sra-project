public java.math.BigDecimal getDecimal(java.lang.String index, java.math.BigDecimal defaultVal) {
    java.lang.Object value = getter(index);
    java.math.BigDecimal results = defaultVal;
    try {
        java.lang.String[] values = ((java.lang.String[]) (value));
        results = new java.math.BigDecimal(values[0]);
    } catch (java.lang.Exception e) {
    }
    return results;
}