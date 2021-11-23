@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    timber.log.Timber.d("Intent Received");
    if (QuoteSyncJob.ACTION_DATA_UPDATED.equals(intent.getAction())) {
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        android.content.ComponentName stockWidget = new android.content.ComponentName(context, com.richarddapice.stockhawk.widget.StockWidgetProvider.class);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(stockWidget);
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.stock_list);
    }
}