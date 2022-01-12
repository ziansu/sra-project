public static javax.money.convert.ExchangeRateProvider getExchangeRateProvider(javax.money.convert.ConversionQuery conversionQuery) {
    return javax.money.convert.MonetaryConversions.getMonetaryConversionsSpi().getExchangeRateProvider(conversionQuery);
}