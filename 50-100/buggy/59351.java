public static void initLocalData(java.lang.String username) {
    io.realm.RealmConfiguration config = new io.realm.RealmConfiguration.Builder().deleteRealmIfMigrationNeeded().name((username + ".realm")).build();
    boolean clearData = true;
    if (clearData) {
        io.realm.Realm.deleteRealm(config);
    }
    io.realm.Realm.setDefaultConfiguration(config);
    com.penn.ajb3.PPApplication.reconnectToServer();
}