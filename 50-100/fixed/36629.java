@java.lang.Override
public void onClick(android.view.View v) {
    if ((alarmDataList.size()) < 50) {
        com.dane.dni.alarms.AlarmData newAlarmData = new com.dane.dni.alarms.AlarmData(0, 0, 0, 0, 0, 0, 0, true, generateAlarmId());
        alarmListAdapter.add(newAlarmData);
        updateAlarmPreferences();
    }
}