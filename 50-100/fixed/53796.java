private void receiveMessages() {
    java.util.List<SimulationEvent> events = eventList.getEvents(time);
    for (int i = 0; i < (events.size()); i++) {
        SimulationEvent event = events.get(i);
        if (event.isReceive()) {
            event.getMessage().destination.receiveMessage(event.getMessage());
        }
    }
}