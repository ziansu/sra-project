public void addAttendant(java.lang.Long eventId, java.lang.Long attendantId) {
    com.centric.centricexpress.models.Event event = eventRepository.findById(eventId);
    event.getAttendants().add(attendantId);
    eventRepository.save(event);
}