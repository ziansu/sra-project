public it.msec.salestaxes.base.Money roundToNearest(java.math.BigDecimal roundingUnit) {
    java.math.BigDecimal roundedValue = value.divide(roundingUnit).setScale(0, java.math.RoundingMode.HALF_UP).multiply(roundingUnit).setScale(2, java.math.RoundingMode.HALF_UP);
    return new it.msec.salestaxes.base.Money(roundedValue);
}