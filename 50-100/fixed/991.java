public static void setUpAlarm(android.content.Context context) {
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    android.content.Intent createdIntent = new android.content.Intent(context, se.chalmers.projektgrupplp4.studentlivinggbg.AlarmReceiver.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context, 0, createdIntent, 0);
    alarmManager.set(AlarmManager.RTC_WAKEUP, ((java.lang.System.currentTimeMillis()) + 1000), pendingIntent);
}