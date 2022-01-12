@java.lang.Override
public void migrate(io.realm.DynamicRealm realm, long oldVersion, long newVersion) {
    io.realm.RealmSchema schema = realm.getSchema();
    if (oldVersion == 0) {
        schema.create("User").removeField("energy").removeField("maxEnergy");
        oldVersion++;
    }
    if (oldVersion == 1) {
    }
}