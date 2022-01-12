public static void logout(final android.content.Context context) {
    final io.pivotal.android.auth.AccountsProxy accountsProxy = io.pivotal.android.auth.AccountsProxyHolder.get(context);
    accountsProxy.removeOnAccountsUpdatedListener(io.pivotal.android.auth.AccountsChangedListener.getInstance(context));
    if ((io.pivotal.android.auth.Accounts.getAccount(context)) != null) {
        accountsProxy.addOnAccountsUpdatedListener(io.pivotal.android.auth.AccountsChangedListener.getInstance(context));
        accountsProxy.clearCookies();
        io.pivotal.android.auth.Accounts.removeAccount(context);
    }
}