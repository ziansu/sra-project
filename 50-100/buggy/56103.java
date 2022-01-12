protected void flush() {
    if (!(shuttingDown)) {
        org.opendaylight.openflowjava.protocol.impl.core.connection.AbstractOutboundQueueManager.LOG.trace("Dequeuing messages to channel {}", parent.getChannel());
        writeAndFlush();
        rescheduleFlush();
    }else
        if (currentQueue.finishShutdown()) {
            close();
            org.opendaylight.openflowjava.protocol.impl.core.connection.AbstractOutboundQueueManager.LOG.debug("Channel {} shutdown complete", parent.getChannel());
        }else {
            org.opendaylight.openflowjava.protocol.impl.core.connection.AbstractOutboundQueueManager.LOG.trace("Channel {} current queue not completely flushed yet", parent.getChannel());
            rescheduleFlush();
        }
    
}