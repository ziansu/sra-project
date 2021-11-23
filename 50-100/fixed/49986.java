public void deleteEvent(carelender.model.Event eventObj) {
    for (int i = 0; i < (events.size()); i++) {
        if ((events.get(i).getUid()) == (eventObj.getUid())) {
            updateUndoManager(events.get(i), UndoType.DELETE);
            events.remove(i);
        }
        saveToFile(fileName, events);
    }
}