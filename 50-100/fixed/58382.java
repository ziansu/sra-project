@java.lang.Override
public void onClick(android.view.View v) {
    int adapterPosition = getAdapterPosition();
    if (cursor.moveToPosition(adapterPosition)) {
        java.lang.String symbol = cursor.getString(Contract.Quote.POSITION_SYMBOL);
        boolean isUnknown = (cursor.getInt(Contract.Quote.POSITION_UNKNOWN)) == 1;
        clickHandler.onStockClick(symbol, isUnknown);
    }
}