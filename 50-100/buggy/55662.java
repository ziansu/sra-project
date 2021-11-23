private void cancelAlarmIntent(java.lang.String key) {
    android.content.Intent alarmIntent = new android.content.Intent(context, au.com.wallaceit.pebblewatchfacescheduler.ScheduleReceiver.class);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(context.getApplicationContext(), java.lang.Long.valueOf(key).intValue(), alarmIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (context.getSystemService(Context.ALARM_SERVICE)));
    alarmManager.cancel(pendingIntent);
}