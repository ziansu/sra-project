@java.lang.Override
public void OnRingtoneSelected(java.lang.String ringtoneName, android.net.Uri ringtoneUri) {
    alarm.setAlarmTonePath(ringtoneUri.toString());
    alarm.setAlarmToneName(ringtoneName);
    text2.setText(ringtoneName);
    setMathAlarm(alarm);
}