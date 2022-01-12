public void addEvent(java.lang.Runnable event) {
    java.nio.channels.Selector selector = this.selector.get();
    if (selector != null) {
        synchronized(events) {
            events.add(event);
        }
        if (org.apache.catalina.tribes.transport.nio.NioReceiver.log.isTraceEnabled())
            org.apache.catalina.tribes.transport.nio.NioReceiver.log.trace(("Adding event to selector:" + event));
        
        if (isListening())
            selector.wakeup();
        
    }
}