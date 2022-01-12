@java.lang.Override
public void onClick(android.view.View arg0) {
    int hour = timeSetter.getCurrentHour();
    int minute = timeSetter.getCurrentMinute();
    java.util.Calendar cal = java.util.Calendar.getInstance();
    cal.set(java.util.Calendar.HOUR, hour);
    cal.set(java.util.Calendar.MINUTE, minute);
    cal.set(java.util.Calendar.SECOND, 0);
    timeToggle.setChecked(true);
    timerWindow.dismiss();
    alarm.setExact(AlarmManager.RTC_WAKEUP, cal.getTimeInMillis(), pendingPandoraIntent);
}