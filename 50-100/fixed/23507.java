@java.lang.Override
public boolean deleteEvent(java.lang.String eventId) {
    io.realm.RealmQuery<de.grau.organizer.classes.Event> query = realm.where(de.grau.organizer.classes.Event.class);
    query.equalTo("id", eventId);
    de.grau.organizer.classes.Event result = query.findFirst();
    if (result == null) {
        return false;
    }else {
        result.deleteFromRealm();
        return true;
    }
}