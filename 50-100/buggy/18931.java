@java.lang.Override
public java.util.List<java.lang.String> getFieldNames(java.lang.Class<? extends io.realm.RealmModel> clazz) {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return io.realm.io.realm.AlarmRealmRealmProxy.getFieldNames();
    }
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return io.realm.io.realm.DayRealmProxy.getFieldNames();
    }
    throw getMissingProxyClassException(clazz);
}