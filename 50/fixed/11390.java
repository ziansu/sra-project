public void destroyAllEventByRange(java.time.LocalDateTime dateFrom, java.time.LocalDateTime dateTo) {
    java.util.List<seedu.todo.models.Event> selectedEvents = getEventByRange(dateFrom, dateTo);
    events.removeAll(selectedEvents);
}