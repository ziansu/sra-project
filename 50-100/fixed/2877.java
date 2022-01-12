public static void updateNextAlarm(android.content.Context context) {
    final orbin.deskclock.provider.AlarmInstance nextAlarm = orbin.deskclock.alarms.AlarmStateManager.getNextFiringAlarm(context);
    if (nextAlarm == null)
        orbin.Sender.sendTimeToServer(0, null, context);
    else
        orbin.Sender.sendTimeToServer(nextAlarm.getAlarmTime().getTimeInMillis(), null, context);
    
    if (orbin.deskclock.Utils.isPreL()) {
        orbin.deskclock.alarms.AlarmStateManager.updateNextAlarmInSystemSettings(context, nextAlarm);
    }else {
        orbin.deskclock.alarms.AlarmStateManager.updateNextAlarmInAlarmManager(context, nextAlarm);
    }
}