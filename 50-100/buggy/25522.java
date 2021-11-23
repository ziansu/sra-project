@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (RecipeProvider.ACTION_DATA_UPDATED.equals(intent.getAction())) {
        android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(context);
        int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new android.content.ComponentName(context, getClass()));
        appWidgetManager.notifyAppWidgetViewDataChanged(appWidgetIds, R.id.lv_ingredients);
    }
}