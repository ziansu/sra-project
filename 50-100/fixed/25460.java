boolean isFlushed() {
    org.opendaylight.openflowjava.protocol.impl.core.connection.OutboundQueueImpl.LOG.debug("Check queue {} for completeness (offset {}, reserve {})", this, flushOffset, reserve);
    if ((flushOffset) < (reserve)) {
        return false;
    }
    return ((flushOffset) >= (queue.length)) || (!(queue[reserve].isCommitted()));
}