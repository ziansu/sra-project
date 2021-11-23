@java.lang.Override
public void deleteEvent(int eventId) throws model.exceptions.NoSuchEventException {
    this.events.remove(this.getEvent(eventId).toString());
}