@java.lang.Override
public void moveEvent(int eventId, java.util.GregorianCalendar newDate) throws model.exceptions.InvalidDateException, model.exceptions.NoSuchEventException, model.exceptions.UnEditableEventException {
    this.validateDate(newDate);
    this.validateEvent(eventId);
    ((timeline.Event) (this.serializer.getItem(eventId))).setDate(newDate);
}