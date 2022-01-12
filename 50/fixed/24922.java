@java.lang.Override
public java.util.List<at.shockbytes.coins.currency.OwnedCurrency> call(java.util.List<at.shockbytes.coins.currency.OwnedCurrency> c, java.util.List<at.shockbytes.coins.network.model.PriceConversion> conversions, at.shockbytes.coins.currency.CurrencyConversionRates rates) {
    return updateOwnedCurrencyConversions(c, conversions, null);
}