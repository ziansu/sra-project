@java.lang.Override
public java.util.List<at.shockbytes.coins.currency.OwnedCurrency> call(java.util.List<at.shockbytes.coins.currency.OwnedCurrency> currencies, at.shockbytes.coins.currency.CurrencyConversionRates rates) {
    return updateOwnedCurrencyConversions(currencies, null, rates);
}