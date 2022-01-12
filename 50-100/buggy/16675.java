@java.lang.Override
public void execute(io.realm.Realm realm) {
    io.realm.RealmResults<com.home.young.myPassword.model.Password> realmResults = realm.where(com.home.young.myPassword.model.Password.class).equalTo("Id", id).findAll();
    if ((realmResults.size()) > 0) {
        realmResults.deleteAllFromRealm();
    }
}