@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    for (int appWidgetId : appWidgetIds) {
        android.vassilis.wifionoff.WifiWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
    }
    updateWidget(context, android.vassilis.wifionoff.WifiWidget.WIFI_INFO.getSSID());
}