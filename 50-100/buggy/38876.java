public double calculateTradeValue() {
    double sellValueAsReferenceCurrency = (sellValue) * (threadLocalVariables.getEstimatedValues().get(se.simjarr.global.Currency.fromValue(sellCurrency)));
    double buyValueAsReferenceCurrency = (buyValue) * (threadLocalVariables.getEstimatedValues().get(se.simjarr.global.Currency.fromValue(buyCurrency)));
    return sellValueAsReferenceCurrency - buyValueAsReferenceCurrency;
}