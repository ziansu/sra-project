void addStock(java.lang.String symbol) {
    if ((symbol != null) && (!(symbol.isEmpty()))) {
        if (networkUp()) {
            mSwipeRefreshLayout.setRefreshing(true);
        }else {
            java.lang.String message = getResources().getString(R.string.toast_stock_added_no_connectivity);
            android.widget.Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        com.udacity.stockhawk.data.PrefUtils.addStock(this, symbol);
        com.udacity.stockhawk.sync.QuoteSyncJob.syncImmediately(this);
    }
}