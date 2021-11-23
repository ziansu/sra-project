@java.lang.Override
public java.util.Collection<org.openhab.binding.zwave.internal.protocol.SerialMessage> getDynamicValues(boolean refresh) {
    java.util.ArrayList<org.openhab.binding.zwave.internal.protocol.SerialMessage> result = new java.util.ArrayList<org.openhab.binding.zwave.internal.protocol.SerialMessage>();
    for (java.util.Map.Entry<org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveAlarmCommandClass.AlarmType, org.openhab.binding.zwave.internal.protocol.commandclass.ZWaveAlarmCommandClass.Alarm> entry : alarms.entrySet()) {
        if ((refresh == true) || ((entry.getValue().getInitialised()) == false)) {
            result.add(getMessage(entry.getValue().getAlarmType()));
        }
    }
    return result;
}