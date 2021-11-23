public void fireNoDataAlarm(android.view.View v) {
    android.content.Intent alarmIntent = new android.content.Intent(this, com.philoertel.sfjuryduty.NoDataAlarmReceiver.class);
    alarmIntent.putExtra(NoDataAlarmReceiver.EXTRA_DATE, org.joda.time.DateTime.now());
    sendBroadcast(alarmIntent);
}