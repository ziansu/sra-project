public void toggleAlarm(android.view.View view) {
    com.example.alexfaber.sumanalarm.Alarm.getAlarm().turnedOff();
    if (alarmTone.isPlaying())
        toggleAlarmSound();
    
    android.widget.Button button = ((android.widget.Button) (findViewById(R.id.toggleButton)));
    button.setEnabled(false);
    finish();
    android.content.Intent mainActivityIntent = new android.content.Intent(this, com.example.alexfaber.sumanalarm.Activities.MainActivity.class);
    startActivity(mainActivityIntent);
}