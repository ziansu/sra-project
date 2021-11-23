@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.i("Service", "MyService onStartCommand");
    android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(this);
    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(this, com.udacity.stockhawk.StockHawkProvider.class));
    com.udacity.stockhawk.StockHawkProvider.updateAppWidget(this, appWidgetManager, appWidgetIds[0]);
    return android.app.Service.START_STICKY;
}