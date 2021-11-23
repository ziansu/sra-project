private java.math.BigDecimal calculateIntrinsicValue() throws java.lang.Exception {
    this.intrinsicValue = (this.isCallOption) ? this.underlyingPrice.subtract(this.strike) : this.strike.subtract(this.underlyingPrice);
    this.intrinsicValue = scale(((this.intrinsicValue.compareTo(java.math.BigDecimal.ZERO)) > 0 ? this.intrinsicValue : java.math.BigDecimal.ZERO));
    return this.intrinsicValue;
}