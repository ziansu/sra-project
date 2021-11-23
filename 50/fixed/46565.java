private java.math.BigDecimal calculateRight6(java.math.BigDecimal n) {
    return big(1).divide(big(10).multiply(n).add(big(9)), context);
}