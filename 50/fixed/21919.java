public void addAttendant(java.lang.String eventId, java.lang.String attendantId) {
    com.centric.centricexpress.models.Event event = eventRepository.findById(eventId);
    event.getAttendants().add(attendantId);
    eventRepository.save(event);
}