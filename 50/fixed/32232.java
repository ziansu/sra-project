private java.math.BigDecimal calculateRight4(java.math.BigDecimal n) {
    return big(2).pow(2).divide(big(10).multiply(n).add(big(5)), context).negate();
}