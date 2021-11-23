private android.accounts.Account fetchAccount(java.lang.String accountName) {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(appContext, Manifest.permission.GET_ACCOUNTS)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        throw new java.lang.RuntimeException("Permissions not granted");
    }
    android.accounts.Account[] accounts = ((android.accounts.AccountManager) (appContext.getSystemService(Context.ACCOUNT_SERVICE))).getAccountsByType(accountType);
    for (android.accounts.Account existingAccount : accounts) {
        if (existingAccount.name.equals(accountName)) {
            return existingAccount;
        }
    }
    return null;
}