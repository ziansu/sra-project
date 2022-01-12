private static void obtainLastAccData() {
    if ((com.example.ol.medotest.Account.MyAccountManager.am) == null)
        return ;
    
    android.accounts.Account[] accounts = com.example.ol.medotest.Account.MyAccountManager.am.getAccountsByType(com.example.ol.medotest.Account.MyAccountManager.accType);
    com.example.ol.medotest.Account.MyAccountManager.accNames = new java.util.ArrayList(accounts.length);
    if ((accounts.length) == 0)
        return ;
    
    for (int i = 0; i < (accounts.length); i++)
        com.example.ol.medotest.Account.MyAccountManager.accNames.add(accounts[i].name);
    
    com.example.ol.medotest.Account.MyAccountManager.accLast = accounts[((accounts.length) - 1)];
}