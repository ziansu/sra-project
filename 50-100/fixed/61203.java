public void setSnooze(android.view.View view) {
    android.util.Log.v("AlarmActivity", ("setSnooze() called at: " + (java.lang.System.currentTimeMillis())));
    if (alarmTone.isPlaying())
        toggleAlarmSound();
    
    android.content.Intent mainActivityIntent = new android.content.Intent(this, com.example.alexfaber.sumanalarm.Activities.MainActivity.class);
    com.example.alexfaber.sumanalarm.Alarm.getAlarm().setSnooze(this);
    startActivity(mainActivityIntent);
}