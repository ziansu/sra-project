public static void addStock(android.content.Context context, java.lang.String symbol) {
    com.udacity.stockhawk.data.PrefUtils.editStockPref(context, symbol.toUpperCase(), true);
}