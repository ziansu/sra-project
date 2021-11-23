public void timerStartService() {
    android.content.Intent myIntent = new android.content.Intent(this, dolkand.tips.AlarmReceiver.class);
    android.app.AlarmManager am = ((android.app.AlarmManager) (getSystemService(Context.ALARM_SERVICE)));
    android.app.PendingIntent pendingIntent = android.app.PendingIntent.getBroadcast(this, 0, myIntent, 0);
    assert am != null;
    am.setInexactRepeating(AlarmManager.RTC, android.os.SystemClock.elapsedRealtime(), 1800000, pendingIntent);
}