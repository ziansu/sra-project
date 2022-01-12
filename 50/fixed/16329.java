public void setPriceChangePercent(java.math.BigDecimal priceChangePercent) {
    priceChangePercent = priceChangePercent.setScale(2, java.math.RoundingMode.CEILING);
    this.priceChangePercent = priceChangePercent;
}