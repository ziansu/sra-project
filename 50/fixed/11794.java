public void sendOnIEvent(ir.ac.aut.ceit.aolab.OnIEvent onIEvent) {
    org.kaaproject.kaa.client.event.EventFamilyFactory eventFamilyFactory = kaaClient.getEventFamilyFactory();
    ir.ac.aut.ceit.aolab.LampEventFamily lampEventFamily = eventFamilyFactory.getLampEventFamily();
    lampEventFamily.sendEventToAll(onIEvent);
}