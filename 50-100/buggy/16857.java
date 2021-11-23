@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    android.util.Log.v(TAG, ("onUpdate: appWidgetIds = " + (java.util.Arrays.toString(appWidgetIds))));
    super.onUpdate(context, appWidgetManager, appWidgetIds);
    ca.rmen.android.frcwidget.FRCWidgetScheduler.getInstance(context).schedule();
}