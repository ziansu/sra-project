public static org.csstudio.alarm.service.internal.IAlarmMessage newAlarmMessage(org.csstudio.dal2.service.IPvAccess<java.lang.String> pvAccess, boolean connection) {
    org.csstudio.alarm.service.internal.AlarmMessageDAL2Impl alarmMessageDAL2Impl = new org.csstudio.alarm.service.internal.AlarmMessageDAL2Impl(pvAccess);
    alarmMessageDAL2Impl.isConnected = connection;
    return alarmMessageDAL2Impl;
}