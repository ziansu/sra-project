private java.math.BigDecimal calculateAdditionalTaxes(java.math.BigDecimal curntInsTotalTaxableAmt, final java.math.BigDecimal entry) {
    return entry.multiply(curntInsTotalTaxableAmt).divide(java.math.BigDecimal.valueOf(100)).setScale(0, java.math.BigDecimal.ROUND_HALF_UP);
}