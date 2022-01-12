@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    android.content.Intent intent = getIntent();
    if ((intent != null) && (intent.hasExtra(com.udacity.stockhawk.ui.DetailActivity.EXTRA_STOCK_HISTORY))) {
        com.udacity.stockhawk.dto.StockHistory stockHistory = intent.getParcelableExtra(com.udacity.stockhawk.ui.DetailActivity.EXTRA_STOCK_HISTORY);
        renderStockChart(stockHistory);
    }
}