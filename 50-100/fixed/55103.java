public void updateAllWidgets(android.content.Context context, int[] appWidgetIds, android.appwidget.AppWidgetManager appWidgetManager, boolean isRefreshing) {
    final int N = appWidgetIds.length;
    for (int i = 0; i < N; i++) {
        android.widget.RemoteViews layout = updateWidgetListView(context, appWidgetIds[i], isRefreshing);
        appWidgetManager.updateAppWidget(appWidgetIds[i], layout);
    }
}