public java.math.BigDecimal getUnitaryPrice(java.math.BigDecimal amountValue, java.math.BigDecimal amountQtt) {
    return amountValue.abs().divide(amountQtt, 3, java.math.RoundingMode.HALF_UP);
}