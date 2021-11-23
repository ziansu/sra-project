protected boolean sellOrderSufficientFunds(java.math.BigDecimal totalProceeds) {
    return ((totalProceeds.compareTo(this.getValue())) < 1) && ((totalProceeds.compareTo(new java.math.BigDecimal(0))) != 0);
}