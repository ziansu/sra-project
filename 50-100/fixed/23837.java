private android.accounts.Account createAccount(android.accounts.AccountManager accountManager, java.lang.String username, java.lang.String token) {
    final android.accounts.Account account = new android.accounts.Account(username, edu.byu.support.login.authentication.AuthConstants.BYU_ACCOUNT_TYPE);
    accountManager.addAccountExplicitly(account, null, null);
    accountManager.setAuthToken(account, AuthConstants.TYPE_BEARER_TOKEN, token);
    return account;
}