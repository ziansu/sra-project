@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    java.lang.String action = intent.getAction();
    if (action.equals(AuthenticatorService.WAITRESPONSE)) {
        com.readyo.app.authentication.AuthenticationActivity.TOKEN = intent.getStringExtra("TOKEN");
        accountManager = android.accounts.AccountManager.get(getApplicationContext());
        android.accounts.Account[] accounts = accountManager.getAccountsByType("login");
        checkAccount(true);
    }else
        if (action.equals("INVALIDCREDENTIALS")) {
            checkAccount(false, null);
            unregisterReceiver(refreshedTokenReceiver);
        }
    
}