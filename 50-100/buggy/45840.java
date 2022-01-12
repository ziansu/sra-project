public static void editStockPref(android.content.Context context, java.lang.String symbol, java.lang.Boolean add) {
    java.lang.String key = context.getString(R.string.pref_stocks_key);
    java.util.Set<java.lang.String> stocks = com.udacity.stockhawk.data.PrefUtils.getStocks(context);
    if (add) {
        stocks.add(symbol);
    }else {
        stocks.remove(symbol);
    }
    android.content.SharedPreferences prefs = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    android.content.SharedPreferences.Editor editor = prefs.edit();
    editor.putStringSet(key, stocks);
    editor.apply();
}