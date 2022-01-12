@java.lang.Override
public void run() {
    if (org.shaolin.bmdp.workflow.ws.NotificationService.push(message, message.getPartyId())) {
        message.setRead(true);
    }
    CoordinatorModel.INSTANCE.create(message, true);
    for (org.shaolin.bmdp.workflow.coordinator.INotificationListener listener : listeners) {
        listener.received(message);
    }
}