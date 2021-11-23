public void add(org.apache.log4j.spi.LoggingEvent event) {
    boolean publish = false;
    synchronized(EVENTQUEUELOCK) {
        eventQueue.add(event);
        (eventQueueLength)++;
        if ((eventQueueLength) >= (capacity)) {
            publish = true;
        }
    }
    if (publish) {
        flushAndPublishQueue(false);
    }
}