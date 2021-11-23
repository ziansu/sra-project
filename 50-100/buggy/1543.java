@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    super.onReceive(context, intent);
    if (API.ACTION_DATABASE_UPDATED.equals(intent.getAction())) {
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, getClass()));
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.widget_list);
        android.widget.Toast.makeText(context, "Received something", Toast.LENGTH_SHORT).show();
        android.util.Log.d("TAG", "IN ON RECIEVE");
    }
}