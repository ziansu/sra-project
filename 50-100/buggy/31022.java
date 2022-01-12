@java.lang.Override
public io.realm.RealmObjectSchema createRealmObjectSchema(java.lang.Class<? extends io.realm.RealmModel> clazz, io.realm.RealmSchema realmSchema) {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return io.realm.io.realm.AlarmRealmRealmProxy.createRealmObjectSchema(realmSchema);
    }
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return io.realm.io.realm.DayRealmProxy.createRealmObjectSchema(realmSchema);
    }
    throw getMissingProxyClassException(clazz);
}