public static void setNotificationAlarm(android.content.Context context) {
    android.app.PendingIntent pendingIntent = com.mattleibold.bulktracker.Utilities.getAlarmReceiverPI(context);
    android.app.AlarmManager alarmMgr = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    long interval = android.app.AlarmManager.INTERVAL_DAY;
    alarmMgr.setInexactRepeating(AlarmManager.RTC, ((java.lang.System.currentTimeMillis()) - 1), interval, pendingIntent);
}