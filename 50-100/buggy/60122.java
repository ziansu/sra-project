private void resetTimer(android.content.Context context, android.widget.RemoteViews views, int appWidgetId) {
    android.util.Log.d(com.valyakinaleksey.timerwidgetupdated.TimerWidget.LOG_TAG, "Reset timer");
    views.setTextViewText(R.id.tv_timer, com.valyakinaleksey.timerwidgetupdated.TimerWidget.DEFAULT_TEXT);
    views.setInt(R.id.play_pause, "setImageResource", R.drawable.ic_play_circle_fill);
    com.valyakinaleksey.timerwidgetupdated.Timer timer = com.valyakinaleksey.timerwidgetupdated.TimerWidget.timerMap.get(appWidgetId);
    if (timer != null) {
        timer.setElapsedTime(0);
        timer.setStarted(false);
        timer.setThread(null);
    }
    updateWidget(context, appWidgetId, views);
}