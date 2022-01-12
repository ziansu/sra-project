public void snoozeAlarm(int snoozeDuration) {
    android.content.Intent intent = new android.content.Intent(mContext, com.moupress.app.alarm.AlarmReceiver.class);
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt(com.moupress.app.alarm.AlarmManagerMgr.AlarmNumber, Const.SNOOZE_ALARM);
    intent.putExtras(bundle);
    android.app.PendingIntent pi = android.app.PendingIntent.getBroadcast(mContext, Const.SNOOZE_ALARM, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    alarmMgr.set(AlarmManager.RTC_WAKEUP, ((java.lang.System.currentTimeMillis()) + snoozeDuration), pi);
}