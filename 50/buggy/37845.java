public rx.Observable<java.lang.Void> insertOrUpdate(io.realm.RealmObject object) {
    java.util.List<io.realm.RealmObject> list = java.util.Arrays.asList(object);
    return insertOrUpdate(list);
}