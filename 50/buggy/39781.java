public static void remove(int index) {
    dynoapps.exchange_rates.alarm.AlarmManager.getAlarmsHolder().alarms.remove(index);
    org.greenrobot.eventbus.EventBus.getDefault().post(new dynoapps.exchange_rates.event.AlarmUpdateEvent(false, false));
    dynoapps.exchange_rates.alarm.AlarmManager.persistAlarms();
}