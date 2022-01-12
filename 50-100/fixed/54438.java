@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    final io.realm.RealmResults<com.ivart.makedecision.Model.DecisionDescription> results = realm.where(com.ivart.makedecision.Model.DecisionDescription.class).equalTo("id", id).equalTo("square", square).findAll();
    realm.executeTransaction(new io.realm.Realm.Transaction() {
        @java.lang.Override
        public void execute(io.realm.Realm realm) {
            results.deleteAllFromRealm();
        }
    });
}