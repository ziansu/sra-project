public static java.lang.Double convertToBitcoinFromCurrency(android.content.Context ctx, java.lang.Double currency) {
    java.lang.Double bitcoin;
    bitcoin = currency / (ctx.getSharedPreferences(Constant.PREF_CURRENT_USER, Context.MODE_PRIVATE).getFloat(Constant.CURRENCY_VALUE, 1.0F));
    return bitcoin;
}