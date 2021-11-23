public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    android.util.Log.v(com.apps.home.notewidget.widget.WidgetProvider.TAG, "onUpdate");
    for (int appWidgetId : appWidgetIds) {
        if (isConfigured(context, appWidgetId)) {
            updateNote(context, appWidgetId);
            appWidgetManager.updateAppWidget(appWidgetId, updateWidgetListView(context, appWidgetId));
        }
    }
    super.onUpdate(context, appWidgetManager, appWidgetIds);
}