@java.lang.Override
public boolean writeEvent(final de.grau.organizer.classes.Event event) {
    if (realm.isClosed())
        realm = io.realm.Realm.getDefaultInstance();
    
    realm.beginTransaction();
    realm.copyToRealmOrUpdate(event);
    realm.commitTransaction();
    return false;
}