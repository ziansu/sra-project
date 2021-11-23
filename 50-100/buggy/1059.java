@java.lang.Override
public void onItemClick(android.view.View v, int position) {
    java.lang.String symbol = ((android.widget.TextView) (findViewById(R.id.stock_symbol))).getText().toString();
    android.content.Intent intent = new android.content.Intent(mContext, com.sam_chordas.android.stockhawk.ui.DetailStocksActivity.class);
    intent.putExtra("symbol", symbol);
    startActivity(intent);
}