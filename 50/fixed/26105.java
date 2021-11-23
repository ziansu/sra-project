@java.lang.Override
public boolean isAlarmMessage() {
    return ((content.containsKey(AlarmMessageKeyEnum.NAME.getStringValue())) || (isDeviceTestRequest())) && (!(isCommandMessage()));
}