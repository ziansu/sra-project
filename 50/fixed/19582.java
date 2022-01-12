private static java.lang.String generateByBigDecimal(java.lang.String a, java.lang.String b) {
    return new java.math.BigDecimal(a).add(new java.math.BigDecimal(b)).toString();
}