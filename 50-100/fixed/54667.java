@java.lang.Override
public synchronized void onStated(final io.asimov.microservice.negotiation.ResourceReadyNotification.Result result) {
    for (io.asimov.model.ActivityParticipation cause : io.asimov.model.resource.ResouceReadyInitiatorImpl.instances.keySet()) {
        io.asimov.model.resource.ResouceReadyInitiatorImpl.ResouceReadyInitiatorHandler handler = io.asimov.model.resource.ResouceReadyInitiatorImpl.getInstance(cause);
        if (!(handler.isDone()))
            handler.handle(result);
        
    }
}