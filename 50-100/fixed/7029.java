@java.lang.Override
public void onReceive(@android.support.annotation.NonNull
android.content.Context context, @android.support.annotation.NonNull
android.content.Intent intent) {
    super.onReceive(context, intent);
    timber.log.Timber.d("Intent Received");
    if (QuoteSyncJob.ACTION_DATA_UPDATED.equals(intent.getAction())) {
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, getClass()));
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.stock_list);
    }
}