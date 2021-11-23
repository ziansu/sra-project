private void activateAlarmManager() {
    long startTime = readStartTimeFromPrefs();
    setStartTimeFromCurrent();
    int interval = getSelectedIntFromIntervalSpinner();
    alarmMgr = ((android.app.AlarmManager) (this.getSystemService(Context.ALARM_SERVICE)));
    android.content.Intent intent = new android.content.Intent(this, com.mksystems.mks.dreammaster.AlarmReceiver.class);
    alarmIntent = android.app.PendingIntent.getBroadcast(this, 0, intent, 0);
    alarmMgr.setRepeating(AlarmManager.RTC_WAKEUP, startTime, ((1000 * 60) * interval), alarmIntent);
}