@java.lang.Override
public synchronized de.mickare.xserver.events.XServerEvent callEvent(final de.mickare.xserver.events.XServerEvent event) {
    if (event == null) {
        throw new java.lang.IllegalArgumentException("event can't be null");
    }
    long start = java.lang.System.nanoTime();
    bus.post(event);
    event.postCall();
    long elapsed = start - (java.lang.System.nanoTime());
    if (elapsed > 250000) {
        this.logger.log(java.util.logging.Level.WARNING, "Event {0} took more {1}ns to process!", new java.lang.Object[]{ event , elapsed });
    }
    return event;
}