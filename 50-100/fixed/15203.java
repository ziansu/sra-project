public static void initNotification(android.content.Context context) {
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(com.ckt.ckttodo.ui.ALARM_SERVICE)));
    android.content.Intent intent = new android.content.Intent("com.ckt.ckttodo.alarm");
    intent.putExtra(NotificationBroadcastReceiver.NOTIFICATION_TITLE, context.getResources().getString(R.string.remind_title));
    intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, java.lang.System.currentTimeMillis(), 100000, pendingIntent);
}