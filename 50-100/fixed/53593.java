public void undoAddedEvent(carelender.model.EventList eventList) {
    for (int i = 0; i < (events.size()); i++) {
        for (carelender.model.Event eventObj : eventList) {
            if ((events.get(i).getUid()) == (eventObj.getUid())) {
                events.remove(i);
            }
        }
    }
    saveToFile(fileName, events);
}