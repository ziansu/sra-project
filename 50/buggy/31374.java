@java.lang.Override
public void onChange(io.realm.RealmResults<com.zhan.budget.Model.Realm.Account> element) {
    element.removeChangeListener(this);
    android.util.Log.d(com.zhan.budget.Fragment.AccountFragment.TAG, "there's a change in results account ");
    accountList = myRealm.copyFromRealm(element);
    accountRecyclerAdapter.setAccountList(accountList);
    populateAccountWithInfo(true);
}