@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    final int N = appWidgetIds.length;
    int i = 1;
    for (int appWidgetId : appWidgetIds) {
        sturmtruppen.com.trafficwidget.TrafficWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
        android.widget.Toast.makeText(context, ((("onUpdate(): " + (java.lang.String.valueOf(i))) + " : ") + (java.lang.String.valueOf(appWidgetId))), Toast.LENGTH_LONG).show();
        i++;
    }
}