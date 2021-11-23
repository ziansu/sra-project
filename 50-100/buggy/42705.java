public static void saveOrUpdateAccount(io.realm.Realm realm, com.chenenyu.andhub.model.Account account) {
    io.realm.RealmResults<com.chenenyu.andhub.model.Account> results = com.chenenyu.andhub.db.DbAccount.queryAccounts(realm);
    realm.beginTransaction();
    for (com.chenenyu.andhub.model.Account a : results) {
        a.setUsed(false);
    }
    account.setUsed(true);
    realm.copyToRealmOrUpdate(account);
    realm.commitTransaction();
}