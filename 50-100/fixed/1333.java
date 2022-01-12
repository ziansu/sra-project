public boolean cancelAlarm(int alarmPosition) {
    android.content.Intent intent = new android.content.Intent(mContext, com.moupress.app.alarm.AlarmReceiver.class);
    android.app.PendingIntent pi = android.app.PendingIntent.getBroadcast(mContext, alarmPosition, intent, 0);
    try {
        alarmMgr.cancel(pi);
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}