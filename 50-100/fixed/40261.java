public double getConversionRatio(com.bruno.desafiomuxi.currency.Currency.CurrencyTag fromCurrency, com.bruno.desafiomuxi.currency.Currency.CurrencyTag toCurrency) {
    android.util.Pair<com.bruno.desafiomuxi.currency.Currency.CurrencyTag, com.bruno.desafiomuxi.currency.Currency.CurrencyTag> ratioKey = new android.util.Pair(fromCurrency, toCurrency);
    if (ratioMap.containsKey(ratioKey)) {
        return ratioMap.get(ratioKey);
    }else {
        return 0.0;
    }
}