public synchronized io.asimov.model.resource.ResouceReadyInitiatorImpl forProducer(io.asimov.model.ActivityParticipation.ActivityParticipant initiator, io.asimov.model.ActivityParticipation cause) {
    io.asimov.model.resource.ResouceReadyInitiatorImpl.ResouceReadyInitiatorHandler handler = io.asimov.model.resource.ResouceReadyInitiatorImpl.getInstance(cause);
    if (handler == null) {
        handler = new io.asimov.model.resource.ResouceReadyInitiatorImpl.ResouceReadyInitiatorHandler(cause, initiator);
        io.asimov.model.resource.ResouceReadyInitiatorImpl.instances.put(cause, handler);
        handler.checkOtherResources();
    }
    return this;
}