@java.lang.Override
public void onClick(java.lang.String symbol, java.lang.String history) {
    timber.log.Timber.d("Symbol clicked: %s", symbol);
    android.content.Intent intent = new android.content.Intent(this, com.udacity.stockhawk.ui.ChartActivity.class);
    intent.putExtra(ChartActivity.HISTORY_KEY, history);
    intent.putExtra(ChartActivity.SYMBOL_KEY, symbol);
    startActivity(intent);
}