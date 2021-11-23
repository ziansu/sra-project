public java.math.BigDecimal calculateRight2(java.math.BigDecimal n) {
    return big(2).pow(8).divide(big(10).multiply(n).add(big(1)), context);
}