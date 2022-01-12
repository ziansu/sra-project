public void updateAccountOrder() {
    if ((accountListAdapter) != null) {
        int order = 1;
        for (com.xabber.android.data.account.AccountItem account : accountListAdapter.getItems())
            com.xabber.android.data.account.AccountManager.getInstance().setOrder(account.getAccount(), (order++));
        
        com.xabber.android.data.xaccount.XabberAccountManager.getInstance().setLastOrderChangeTimestampIsNow();
        if ((com.xabber.android.data.xaccount.XabberAccountManager.getInstance().getAccount()) != null)
            com.xabber.android.data.xaccount.XabberAccountManager.getInstance().updateAccountSettings();
        
    }
}