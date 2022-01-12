public void startAlarmManager() {
    android.content.Intent myIntent = new android.content.Intent(this, perchello.londontubealarmclock.WifiReceiver.class);
    myIntent.putExtra("stationName", mDestinationStation);
    myIntent.putExtra("mac", mDestinationMac);
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(this, 0, myIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    android.app.AlarmManager alarmManager = ((android.app.AlarmManager) (getSystemService(perchello.londontubealarmclock.ALARM_SERVICE)));
    alarmManager.set(AlarmManager.RTC_WAKEUP, ((android.os.SystemClock.elapsedRealtime()) + 20000), pendingIntent);
}