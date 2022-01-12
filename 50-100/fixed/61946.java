public static void addListener(android.content.Context context, android.widget.RemoteViews rv, int appWidgetId, int componentId, java.lang.String action, java.lang.Class<? extends android.appwidget.AppWidgetProvider> widgetClass) {
    android.content.Intent intent = new android.content.Intent(context, widgetClass).setAction(action).putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, appWidgetId);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context, appWidgetId, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    rv.setOnClickPendingIntent(componentId, pendingIntent);
}