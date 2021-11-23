@java.lang.Override
public void received(dist.esper.core.coordinator.Link link, java.lang.Object obj) {
    if (obj instanceof dist.esper.core.coordinator.AbstractMessage) {
        dist.esper.core.coordinator.AbstractMessage msg = ((dist.esper.core.coordinator.AbstractMessage) (obj));
        if ((msg.getPrimaryType()) == (PrimaryTypes.RESPONSE)) {
            responseMessageHandlingScheduler.submit(link, obj, responseMessageHandler);
        }else {
            messageHandlingScheduler.submit(link, obj, messageHandler);
        }
    }
}