@java.lang.Override
public void onStart() {
    super.onStart();
    if ((resultDrawer) == null) {
        accountList = getAccounts();
        if (!(accountList.isEmpty())) {
            selectedAccount = accountList.get(0);
            createDrawer();
            selectAccount(selectedAccount);
        }
    }
}