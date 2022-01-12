public static void removeAlarm(android.content.Context context) {
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Activity.ALARM_SERVICE)));
    android.content.Intent intent = new android.content.Intent(context, sk.henrichg.phoneprofilesplus.ProfileDurationAlarmBroadcastReceiver.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, PendingIntent.FLAG_NO_CREATE);
    if (pendingIntent != null) {
        alarmManager.cancel(pendingIntent);
        pendingIntent.cancel();
    }
}