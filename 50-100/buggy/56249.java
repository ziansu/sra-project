@java.lang.Override
public <E extends io.realm.RealmModel> E createOrUpdateUsingJsonObject(java.lang.Class<E> clazz, io.realm.Realm realm, org.json.JSONObject json, boolean update) throws org.json.JSONException {
    checkClass(clazz);
    if (clazz.equals(com.example.nikolay.alarm.model.AlarmRealm.class)) {
        return clazz.cast(io.realm.io.realm.AlarmRealmRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
    }
    if (clazz.equals(com.example.nikolay.alarm.model.Day.class)) {
        return clazz.cast(io.realm.io.realm.DayRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
    }
    throw getMissingProxyClassException(clazz);
}