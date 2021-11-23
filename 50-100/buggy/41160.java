public void removeStock(java.lang.String symbol) {
    java.lang.String selection = (Contract.Quote.COLUMN_SYMBOL) + "=?";
    java.lang.String[] mSelectionArgs = new java.lang.String[]{ "" };
    mSelectionArgs[0] = symbol;
    com.udacity.stockhawk.data.PrefUtils.removeStock(this, symbol);
    getContentResolver().delete(Contract.Quote.URI, selection, mSelectionArgs);
}