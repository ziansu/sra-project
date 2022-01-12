private void populateAccount() {
    resultsAccount = myRealm.where(com.zhan.budget.Model.Realm.Account.class).findAllAsync();
    io.realm.RealmChangeListener changeListener = new io.realm.RealmChangeListener() {
        @java.lang.Override
        public void onChange() {
            android.util.Log.d(com.zhan.budget.Fragment.AccountFragment.TAG, "there's a change in results account ");
            accountList = myRealm.copyFromRealm(resultsAccount);
            accountListAdapter.updateList(accountList);
            updateAccountStatus();
        }
    };
    resultsAccount.addChangeListener(changeListener);
}