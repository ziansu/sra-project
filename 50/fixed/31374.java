@java.lang.Override
public void onChange(io.realm.RealmResults<com.zhan.budget.Model.Realm.Account> element) {
    element.removeChangeListener(this);
    accountList = myRealm.copyFromRealm(element);
    accountRecyclerAdapter.setAccountList(accountList);
    populateAccountWithInfo(true);
}