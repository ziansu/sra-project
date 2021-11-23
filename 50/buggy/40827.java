@java.lang.Override
public org.openhab.binding.zwave.internal.protocol.SerialMessage getValueMessage() {
    for (java.util.Map.Entry<org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveAlarmCommandClass.AlarmType, org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveAlarmCommandClass.Alarm> entry : alarms.entrySet()) {
        return getMessage(entry.getValue().getAlarmType());
    }
    return getMessage(org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveAlarmCommandClass.AlarmType.GENERAL);
}