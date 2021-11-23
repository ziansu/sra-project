private java.math.BigDecimal calculateLeft(int n) {
    return big(1).negate().pow(n).divide(big(2).pow(10).pow(n), context);
}