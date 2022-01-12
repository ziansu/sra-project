public static void saveOrUpdateAccount(io.realm.Realm realm, com.chenenyu.andhub.model.Account account) {
    io.realm.RealmResults<com.chenenyu.andhub.model.Account> results = com.chenenyu.andhub.db.DbAccount.queryAccounts(realm);
    realm.beginTransaction();
    int size = results.size();
    for (int i = 0; i < size; i++) {
        results.get(i).setUsed(false);
    }
    account.setUsed(true);
    realm.copyToRealmOrUpdate(account);
    realm.commitTransaction();
}