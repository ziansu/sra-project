@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    createAlarm(context, appWidgetIds);
    context.startService(new android.content.Intent(context, com.droid.manasshrestha.rxandroid.widget.UpdateWidget.class));
}