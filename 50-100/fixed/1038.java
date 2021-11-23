@java.lang.Override
public void onException(javax.jms.JMSException exception) {
    if (amqConn == (connection)) {
        synchronized(syncLock) {
            if (amqConn == (connection)) {
                errorMessage = exception.getMessage();
                com.esri.geoevent.transport.activemq.ActiveMQInboundTransport.LOGGER.error(errorMessage, exception);
                setRunningState(RunningState.STOPPING);
                cleanup();
                setRunningState(RunningState.ERROR);
            }
        }
    }
}