private void processMessage(byte[] message) {
    try {
        org.ulyssis.ipp.updates.TagUpdate update = org.ulyssis.ipp.utils.Serialization.getJsonMapper().readValue(message, org.ulyssis.ipp.updates.TagUpdate.class);
        updateConsumer.accept(new org.ulyssis.ipp.snapshot.events.TagSeenEvent(update));
    } catch (java.io.IOException e) {
        org.ulyssis.ipp.processor.ReaderListener.LOG.error("Couldn't process update {}!", new java.lang.String(message), e);
    }
}