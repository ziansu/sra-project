@java.lang.Override
public void connectionChanged(final org.csstudio.dal2.service.IPvAccess<java.lang.String> source, final boolean isConnected) {
    if (isConnected) {
        _alreadyConnected.incrementAndGet();
    }
    _alarmListener.onMessage(org.csstudio.alarm.service.internal.AlarmMessageDAL2Impl.newAlarmMessage(_pvAccess));
    org.csstudio.alarm.service.internal.AlarmConnectionDAL2Impl.ListenerItem.LOG_INNER.trace("received connection change to {} for pv {} ", new java.lang.Object[]{ source.getPVAddress().getAddress() , isConnected });
}