public void add(org.apache.log4j.spi.LoggingEvent event) {
    boolean publish = false;
    synchronized(EVENTQUEUELOCK) {
        if ((eventQueueLength) < (capacity)) {
            eventQueue.add(event);
            (eventQueueLength)++;
        }else {
            publish = true;
        }
    }
    if (publish) {
        flushAndPublishQueue(false);
    }
}