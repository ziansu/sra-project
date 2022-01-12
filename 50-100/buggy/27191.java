@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d("$$", "onStartCommand - it's happening!");
    android.widget.RemoteViews updateViews = buildUpdate(this);
    android.content.ComponentName widget = new android.content.ComponentName(this, barqsoft.footballscores.ScoresWidgetProvider.class);
    android.appwidget.AppWidgetManager manager = android.appwidget.AppWidgetManager.getInstance(this);
    manager.updateAppWidget(widget, updateViews);
    return START_NOT_STICKY;
}