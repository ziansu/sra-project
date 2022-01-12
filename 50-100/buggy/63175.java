@java.lang.Override
public void onTaskRemoved(android.content.Intent rootIntent) {
    super.onTaskRemoved(rootIntent);
    android.content.Intent intent = new android.content.Intent(this, com.tuenti.smsradar.SmsRadarService.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getService(this, 0, intent, 0);
    long now = getTimeProvider().getDate().getTime();
    getAlarmManager().set(AlarmManager.RTC_WAKEUP, (now + (com.tuenti.smsradar.SmsRadarService.ONE_SECOND)), pendingIntent);
}