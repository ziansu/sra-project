@java.lang.Override
public <E extends io.realm.RealmModel> E createUsingJsonStream(java.lang.Class<E> clazz, io.realm.Realm realm, android.util.JsonReader reader) throws java.io.IOException {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return clazz.cast(io.realm.io.realm.DayRealmProxy.createUsingJsonStream(realm, reader));
    }
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return clazz.cast(io.realm.io.realm.AlarmRealmRealmProxy.createUsingJsonStream(realm, reader));
    }
    throw getMissingProxyClassException(clazz);
}