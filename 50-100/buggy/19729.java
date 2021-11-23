@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.realm.Realm.init(this);
    io.realm.RealmConfiguration realmConfig = new io.realm.RealmConfiguration.Builder().initialData(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            realm.createObject(io.mochadwi.todo_go.models.Parent.class);
        }
    }).schemaVersion(3).deleteRealmIfMigrationNeeded().build();
    io.realm.Realm.setDefaultConfiguration(realmConfig);
}