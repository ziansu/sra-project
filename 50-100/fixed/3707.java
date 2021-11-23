@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    final int N = appWidgetIds.length;
    int i = 1;
    for (int appWidgetId : appWidgetIds) {
        sturmtruppen.com.trafficwidget.TrafficWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
        i++;
    }
}