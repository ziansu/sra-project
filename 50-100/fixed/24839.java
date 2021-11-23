@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    io.realm.Realm.setDefaultConfiguration(new io.realm.RealmConfiguration.Builder(this).build());
    realm = io.realm.Realm.getDefaultInstance();
    messages = realm.where(im.abe.megaphone.app.Message.class).findAllSortedAsync("date", false);
    initUI();
    initBluetooth();
}