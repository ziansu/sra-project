@java.lang.Override
public java.lang.String getTableName(java.lang.Class<? extends io.realm.RealmModel> clazz) {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return io.realm.io.realm.DayRealmProxy.getTableName();
    }
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return io.realm.io.realm.AlarmRealmRealmProxy.getTableName();
    }
    throw getMissingProxyClassException(clazz);
}