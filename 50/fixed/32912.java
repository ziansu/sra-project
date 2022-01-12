@java.lang.Override
public java.util.List<de.grau.organizer.classes.Event> getEvents() {
    io.realm.RealmQuery<de.grau.organizer.classes.Event> query = realm.where(de.grau.organizer.classes.Event.class);
    return query.findAll();
}