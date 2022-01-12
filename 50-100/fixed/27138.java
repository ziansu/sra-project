private void doPublish(final com.enonic.xp.event.EventListener eventListener, final com.enonic.xp.event.Event event) {
    try {
        eventListener.onEvent(event);
    } catch (final java.lang.Exception t) {
        com.enonic.xp.core.impl.event.EventPublisherImpl.LOG.error((((("Failed to deliver event [" + (event.getClass().getName())) + "] to [") + eventListener) + "]"), t);
    }
}