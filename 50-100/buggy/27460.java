private void updateAlarmTime(android.content.Context context, int alarmId, long newComputedTime, long defaultAlarmTime, java.lang.String name) {
    if (newComputedTime < (defaultAlarmTime - (com.silex.ragomez.trafficawarealarm.AlarmUpdaterBroadcastReceiver.POLLING_INTERVAL))) {
        setOneTimeTimer(context, newComputedTime, name);
        cancel(context, alarmId);
        return ;
    }
    if (defaultAlarmTime < ((java.lang.System.currentTimeMillis()) + (com.silex.ragomez.trafficawarealarm.AlarmUpdaterBroadcastReceiver.POLLING_INTERVAL))) {
        setOneTimeTimer(context, defaultAlarmTime, name);
        cancel(context, alarmId);
    }
}