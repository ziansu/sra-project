public void removeAttendant(java.lang.String eventId, java.lang.String attendantId) {
    com.centric.centricexpress.models.Event event = eventRepository.findById(eventId);
    event.getAttendants().remove(attendantId);
    eventRepository.save(event);
}