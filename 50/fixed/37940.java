public void removeEvent(java.lang.String eventId, java.lang.String eventDayId) {
    com.centric.centricexpress.models.EventDay eventDay = eventDayRepository.findById(eventDayId);
    eventDay.getEvents().remove(eventId);
    eventDayRepository.save(eventDay);
}