void addStock(java.lang.String symbol) {
    if ((symbol != null) && (!(symbol.isEmpty()))) {
        symbol = symbol.toUpperCase();
        if (networkUp()) {
            swipeRefreshLayout.setRefreshing(true);
        }else {
            java.lang.String message = getString(R.string.toast_stock_added_no_connectivity, symbol);
            android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        com.udacity.stockhawk.data.PrefUtils.addStock(this, symbol);
        com.udacity.stockhawk.sync.QuoteSyncJob.syncImmediately(this);
    }
}