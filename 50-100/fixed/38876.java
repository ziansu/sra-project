public double calculateTradeValue() {
    double sellValueAsReferenceCurrency = (sellValue) * (threadLocalVariables.getEstimatedValues().get(se.simjarr.global.Currency.fromValue(sellCurrency)));
    double buyValueAsReferenceCurrency = (buyValue) * (threadLocalVariables.getEstimatedValues().get(se.simjarr.global.Currency.fromValue(buyCurrency)));
    if ((sellValueAsReferenceCurrency < 0) || (buyValueAsReferenceCurrency < 0))
        return -1;
    
    return sellValueAsReferenceCurrency - buyValueAsReferenceCurrency;
}