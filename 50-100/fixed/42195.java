@java.lang.Override
public void deregister(long correlationId) {
    com.ctrip.hermes.consumer.engine.ack.DefaultAckManager.TpgAckHolder holder = m_ackHolders.get(correlationId);
    if (holder != null) {
        holder.stop();
        while ((!(java.lang.Thread.interrupted())) && (holder.hasUnhandleOperation())) {
            try {
                java.util.concurrent.TimeUnit.MILLISECONDS.sleep(50);
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
            }
        } 
    }
}