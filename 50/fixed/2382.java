@java.lang.Override
public de.grau.organizer.classes.Event loadEvent(java.lang.String eventId) {
    io.realm.RealmQuery<de.grau.organizer.classes.Event> query = realm.where(de.grau.organizer.classes.Event.class);
    query.equalTo("id", eventId);
    de.grau.organizer.classes.Event result = query.findFirst();
    return result;
}