public final java.math.BigDecimal getExchangeRate(dataModel.Currency currencyFrom, dataModel.Currency currencyTo) {
    java.math.BigDecimal valueFrom;
    java.math.BigDecimal valueTo;
    synchronized(this.currencyValues) {
        valueFrom = this.currencyValues.get(currencyFrom);
        valueTo = this.currencyValues.get(currencyTo);
    }
    if ((valueFrom != null) && (valueTo != null)) {
        return valueFrom.divide(valueTo, this.scale, this.roundingMode);
    }else {
        return null;
    }
}