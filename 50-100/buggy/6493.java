@java.lang.Override
public void deleteEvent(int eventId) throws model.exceptions.NoSuchEventException, model.exceptions.UnEditableEventException {
    this.validateEvent(eventId);
    timeline.Event event = ((timeline.Event) (this.serializer.getItem(eventId)));
    if (!(event.isEditable())) {
        throw new model.exceptions.UnEditableEventException(event.toString());
    }
    this.serializer.deleteItem(eventId);
}