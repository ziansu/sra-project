@java.lang.Override
public synchronized void onStated(final io.asimov.microservice.negotiation.ResourceReadyNotification.Result result) {
    java.util.List<io.asimov.model.ActivityParticipation> toClean = new java.util.ArrayList<io.asimov.model.ActivityParticipation>();
    for (io.asimov.model.ActivityParticipation cause : io.asimov.model.resource.ResouceReadyInitiatorImpl.instances.keySet()) {
        io.asimov.model.resource.ResouceReadyInitiatorImpl.ResouceReadyInitiatorHandler handler = io.asimov.model.resource.ResouceReadyInitiatorImpl.getInstance(cause);
        handler.handle(result);
        if (handler.isDone())
            toClean.add(cause);
        
    }
    for (io.asimov.model.ActivityParticipation cause : toClean)
        io.asimov.model.resource.ResouceReadyInitiatorImpl.instances.remove(cause);
    
}