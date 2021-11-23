public void cancelAlarm() {
    android.content.Intent intent = new android.content.Intent(this.context, edu.asu.fitbitgarden.services.AlarmBroadcastReceiver.class);
    final android.app.PendingIntent pIntent = android.app.PendingIntent.getBroadcast(this.context, AlarmBroadcastReceiver.REQUEST_CODE, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    android.app.AlarmManager alarm = ((android.app.AlarmManager) (this.context.getSystemService(Context.ALARM_SERVICE)));
    alarm.cancel(pIntent);
}