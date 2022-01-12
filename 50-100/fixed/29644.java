private void processChannelClose(final org.apache.catalina.CometEvent ev) throws java.io.IOException {
    if (closed.compareAndSet(false, true)) {
        ev.close();
        responseContext.channelClosed();
        if (servletLogger.isDebugEnabled())
            servletLogger.debug("Channel CLOSED");
        
    }else {
        if (servletLogger.isDebugEnabled())
            servletLogger.debug("Trying to close channel but it already closed. Ignoring");
        
    }
}