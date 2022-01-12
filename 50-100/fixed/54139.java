public static void setOneShotAlarm(android.content.Context context, int reminderType, int requestCode, java.lang.String alarmInterval, long startTime) {
    com.umb.cs682.projectlupus.util.AlarmUtil.alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    android.content.Intent intent = com.umb.cs682.projectlupus.util.AlarmUtil.buildIntent(context, reminderType, requestCode, alarmInterval, startTime);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context, requestCode, intent, PendingIntent.FLAG_CANCEL_CURRENT);
    com.umb.cs682.projectlupus.util.AlarmUtil.alarmManager.set(AlarmManager.RTC_WAKEUP, startTime, pendingIntent);
}