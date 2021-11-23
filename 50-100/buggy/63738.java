private void catchUp(final de.qyotta.eventstore.EventStream eventStream) {
    try {
        if (isPaused()) {
            return ;
        }
        if (isCatchingUp) {
            return ;
        }
        de.qyotta.eventstore.utils.EventStreamReaderImpl.LOGGER.info("Catching up.");
        isCatchingUp = true;
        eventStream.loadNext();
        while (eventStream.hasNext()) {
            callback.readEvent(eventStream.next());
        } 
        isCatchingUp = false;
    } catch (final java.lang.Throwable t) {
        errorCallback.onError("Error catching up to event stream.", t);
    }
}