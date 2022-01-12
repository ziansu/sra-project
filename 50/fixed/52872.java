public static void migrateRealm(io.realm.RealmConfiguration configuration) throws java.io.FileNotFoundException {
    io.realm.Realm.migrateRealm(configuration, null);
}