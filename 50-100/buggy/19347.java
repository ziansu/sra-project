public static void removeAlarm(sk.henrichg.phoneprofilesplus.Profile profile, android.content.Context context) {
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Activity.ALARM_SERVICE)));
    android.content.Intent intent = new android.content.Intent(context, sk.henrichg.phoneprofilesplus.ProfileDurationAlarmBroadcastReceiver.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context.getApplicationContext(), ((int) (profile._id)), intent, PendingIntent.FLAG_NO_CREATE);
    if (pendingIntent != null) {
        alarmManager.cancel(pendingIntent);
        pendingIntent.cancel();
    }
}