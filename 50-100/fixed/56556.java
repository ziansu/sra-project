public static java.math.BigDecimal getMaxAmount(android.content.Context context, java.lang.String iso) {
    final long MAX_BTC = 21000000;
    if (iso.equalsIgnoreCase("BTC"))
        return com.breadwallet.tools.util.BRBitcoin.getBitcoinAmount(context, new java.math.BigDecimal((MAX_BTC * 100000000)));
    
    com.breadwallet.presenter.entities.CurrencyEntity ent = com.breadwallet.tools.sqlite.CurrencyDataSource.getInstance(context).getCurrencyByIso(iso);
    if (ent == null)
        throw new java.lang.RuntimeException(("no currency in DB for: " + iso));
    
    return new java.math.BigDecimal(((ent.rate) * MAX_BTC));
}