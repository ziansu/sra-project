@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    if (intent.getAction().equals(QuoteSyncJob.ACTION_DATA_UPDATED)) {
        android.appwidget.AppWidgetManager am = android.appwidget.AppWidgetManager.getInstance(context);
        int[] appWidgetIds = am.getAppWidgetIds(new android.content.ComponentName(context, com.udacity.stockhawk.widget.StockWidgetProvider.class));
        am.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.widget_list);
    }
}