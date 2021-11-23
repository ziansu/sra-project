@java.lang.Override
public org.csstudio.dal2.service.cs.ICsOperationHandle start() throws org.csstudio.dal2.service.DalException {
    _timeoutCommand = new org.csstudio.dal2.epics.service.TimeoutCommand(org.csstudio.dal2.epics.service.ChannelMonitor.getAddress(), getListener());
    long timeoutDuration = Dal2Preference.DAL2SERVICE_CONNECTION_TIMEOUT_MSEC.getValue();
    org.csstudio.dal2.epics.service.ChannelMonitor.EXECUTOR.schedule(_timeoutCommand, timeoutDuration, java.util.concurrent.TimeUnit.MILLISECONDS);
    org.csstudio.dal2.service.cs.ICsOperationHandle result = super.start();
    return result;
}