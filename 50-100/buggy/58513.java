public void undoDeletedEvent(carelender.model.EventList eventList) {
    for (int i = 0; i < (eventList.size()); i++) {
        events.add(eventList.get(i));
    }
    saveToFile("events.dat", events);
}