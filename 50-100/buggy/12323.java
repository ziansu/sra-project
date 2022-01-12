@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    super.onUpdate(context, appWidgetManager, appWidgetIds);
    android.util.Log.d(Config.LOG_TAG, "Widget Update, Starting Service");
    Config.context = context;
    context.startService(new android.content.Intent(context, com.mathi_amorim.emmanuel.metrictime.UpdateTimeService.class));
    android.util.Log.d(Config.LOG_TAG, "Service Started");
}