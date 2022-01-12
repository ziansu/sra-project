@android.annotation.TargetApi(value = Build.VERSION_CODES.KITKAT)
private void scheduleAlarmKitkat(long time, android.app.PendingIntent pendingIntent, amai.org.conventions.AlarmScheduler.Accuracy accuracy) {
    long startTime;
    long endTime;
    switch (accuracy) {
        case INACCURATE :
            scheduleAlarm(time, pendingIntent);
            break;
        default :
            if (accuracy == (amai.org.conventions.AlarmScheduler.Accuracy.UP_TO_1_MINUTE_EARLIER)) {
                startTime = time - (amai.org.conventions.utils.Dates.MILLISECONDS_IN_MINUTE);
                endTime = time;
            }else {
                startTime = time;
                endTime = time + (5 * (amai.org.conventions.utils.Dates.MILLISECONDS_IN_MINUTE));
            }
            alarmManager.setWindow(AlarmManager.RTC_WAKEUP, startTime, endTime, pendingIntent);
    }
}