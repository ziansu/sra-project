private static boolean addAlarm(dynoapps.exchange_rates.alarm.Alarm alarm) {
    dynoapps.exchange_rates.alarm.AlarmManager.alarmsHolder = dynoapps.exchange_rates.alarm.AlarmManager.getAlarmsHolder();
    dynoapps.exchange_rates.alarm.AlarmManager.alarmsHolder.alarms.add(alarm);
    org.greenrobot.eventbus.EventBus.getDefault().post(new dynoapps.exchange_rates.event.AlarmUpdateEvent(alarm, true, false));
    dynoapps.exchange_rates.alarm.AlarmManager.persistAlarms();
    return true;
}