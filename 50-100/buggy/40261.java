public double getConversionRatio(com.bruno.desafiomuxi.currency.Currency.CurrencyTag fromCurrency, com.bruno.desafiomuxi.currency.Currency.CurrencyTag toCurrency) {
    android.util.Pair<com.bruno.desafiomuxi.currency.Currency.CurrencyTag, com.bruno.desafiomuxi.currency.Currency.CurrencyTag> ratioKey = new android.util.Pair(com.bruno.desafiomuxi.currency.Currency.CurrencyTag.USD, com.bruno.desafiomuxi.currency.Currency.CurrencyTag.BRL);
    if (ratioMap.containsKey(ratioKey)) {
        return ratioMap.get(ratioKey);
    }else {
        return 0.0;
    }
}