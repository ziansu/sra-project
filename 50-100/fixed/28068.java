public void sendAlarmMessage(com.kuyun.eam.alarm.EamSensorData sensorData, com.kuyun.eam.alarm.EamAlarm alarm) {
    if (AlarmTarget.SMS.match(alarm.getAlarmTarget())) {
        handleSms(sensorData, alarm);
    }else
        if (AlarmTarget.EMAIL.match(alarm.getAlarmTarget())) {
            handleEmail(sensorData, alarm);
        }
    
}