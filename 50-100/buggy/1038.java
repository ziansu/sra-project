@java.lang.Override
public void onException(javax.jms.JMSException exception) {
    synchronized(syncLock) {
        if (((amqConn == (connection)) && ((starterThread) != null)) && (starterThread.isAlive())) {
            errorMessage = exception.getMessage();
            com.esri.geoevent.transport.activemq.ActiveMQInboundTransport.LOGGER.error(errorMessage, exception);
            setRunningState(RunningState.STOPPING);
            cleanup();
            setRunningState(RunningState.ERROR);
        }
    }
}