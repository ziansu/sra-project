public void scheduleNotification() {
    android.content.Intent notificationIntent = new android.content.Intent(ben.avgmovies.notifications.NotificationPublisher.context, ben.avgmovies.notifications.NotificationPublisher.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(ben.avgmovies.notifications.NotificationPublisher.context, 0, notificationIntent, PendingIntent.FLAG_ONE_SHOT);
    long alarmTime = (((android.os.SystemClock.elapsedRealtime()) - (triggerTime)) < (triggerTime)) ? triggerTime : android.os.SystemClock.elapsedRealtime();
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (ben.avgmovies.notifications.NotificationPublisher.context.getSystemService(Context.ALARM_SERVICE)));
    alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, triggerTime, pendingIntent);
}