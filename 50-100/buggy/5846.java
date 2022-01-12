@java.lang.Override
public io.realm.internal.ColumnInfo validateTable(java.lang.Class<? extends io.realm.RealmModel> clazz, io.realm.internal.SharedRealm sharedRealm, boolean allowExtraColumns) {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return io.realm.io.realm.AlarmRealmRealmProxy.validateTable(sharedRealm, allowExtraColumns);
    }
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return io.realm.io.realm.DayRealmProxy.validateTable(sharedRealm, allowExtraColumns);
    }
    throw getMissingProxyClassException(clazz);
}