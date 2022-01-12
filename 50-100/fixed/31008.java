@java.lang.Override
public void connectionChanged(final org.csstudio.dal2.service.IPvAccess<java.lang.String> source, final boolean isConnected) {
    if (isConnected) {
        _alreadyConnected.incrementAndGet();
    }
    org.csstudio.alarm.service.internal.AlarmConnectionDAL2Impl.ListenerItem.LOG_INNER.trace("received connection change to {} for pv {} ", new java.lang.Object[]{ source.getPVAddress().getAddress() , isConnected });
    if (!isConnected) {
        _alarmListener.onMessage(org.csstudio.alarm.service.internal.AlarmMessageDAL2Impl.newAlarmMessage(_pvAccess, new java.util.Date()));
    }
}