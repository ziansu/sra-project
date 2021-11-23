public void sendAlarmMessage(com.kuyun.eam.alarm.EamSensorData sensorData, com.kuyun.eam.alarm.EamAlarm alarm) {
    java.lang.String message = buildMessage(sensorData, alarm);
    if (AlarmTarget.SMS.match(alarm.getAlarmTarget())) {
        handleSms(message, alarm);
    }else
        if (AlarmTarget.EMAIL.match(alarm.getAlarmTarget())) {
            handleEmail(message, alarm);
        }
    
}