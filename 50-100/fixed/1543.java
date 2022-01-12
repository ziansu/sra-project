@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
    int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, getClass()));
    appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.widget_list);
    super.onReceive(context, intent);
}