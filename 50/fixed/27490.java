public static com.xeiam.xchange.currency.Currency getInstance(java.lang.String currencyCode) {
    com.xeiam.xchange.currency.Currency currency = com.xeiam.xchange.currency.Currency.getInstanceNoCreate(currencyCode);
    if (currency == null) {
        return com.xeiam.xchange.currency.Currency.createCurrency(currencyCode.toUpperCase(), null, null);
    }else {
        return currency;
    }
}