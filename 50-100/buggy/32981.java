@java.lang.Override
public <T extends io.realm.RealmObject> java.util.List<T> all(java.lang.Class<T> clazz) {
    io.realm.Realm realm = io.realm.Realm.getInstance(context);
    try {
        return realm.allObjects(clazz);
    } finally {
        realm.close();
    }
}