@java.lang.Override
public void run() {
    if (m_stopped.get()) {
        return ;
    }
    try {
        handleOperations();
        checkHolders();
    } catch (java.lang.Exception e) {
        com.ctrip.hermes.broker.queue.AbstractMessageQueue.log.error("Exception occurred while executing ack task.", e);
    } finally {
        if (!(m_stopped.get())) {
            m_ackOpExecutor.schedule(m_ackTask, m_config.getMessageQueueCheckIntervalMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }
}