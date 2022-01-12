private void updateWidget() {
    final android.appwidget.AppWidgetManager appWidgetManager = android.appwidget.AppWidgetManager.getInstance(this);
    android.widget.RemoteViews views = com.battlelancer.seriesguide.appwidget.ListWidgetProvider.buildRemoteViews(this, appWidgetManager, mAppWidgetId);
    appWidgetManager.updateAppWidget(mAppWidgetId, views);
    java.lang.Runnable runnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            appWidgetManager.notifyAppWidgetViewDataChanged(mAppWidgetId, R.id.list_view);
        }
    };
    new android.os.Handler().postDelayed(runnable, 300);
    setWidgetResult(com.battlelancer.seriesguide.appwidget.RESULT_OK);
    finish();
}