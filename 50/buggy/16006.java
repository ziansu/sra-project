public void rescheduleAlarms(android.content.Context context) {
    loadAlarmList(context);
    for (int i = 0; i < (alarmList.size()); i++) {
        createNewAlarm(context, alarmList.get(i));
    }
}