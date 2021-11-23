public java.math.BigDecimal getAvg(int scale) {
    return sum.divide(new java.math.BigDecimal(count), scale, java.math.BigDecimal.ROUND_HALF_UP);
}