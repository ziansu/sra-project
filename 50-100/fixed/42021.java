private static android.accounts.Account createSyncAccount(android.content.Context context) {
    android.accounts.Account newAccount = new android.accounts.Account(com.philosophicalhacker.philhackernews.PhilHackerNewsApplication.ACCOUNT_NAME, com.philosophicalhacker.philhackernews.PhilHackerNewsApplication.ACCOUNT_TYPE);
    android.accounts.AccountManager accountManager = ((android.accounts.AccountManager) (context.getSystemService(com.philosophicalhacker.philhackernews.ACCOUNT_SERVICE)));
    android.accounts.Account[] accountsByType = accountManager.getAccountsByType(com.philosophicalhacker.philhackernews.PhilHackerNewsApplication.ACCOUNT_TYPE);
    if (!(com.philosophicalhacker.philhackernews.PhilHackerNewsApplication.dummyAccountAlreadyAdded(accountsByType))) {
        accountManager.addAccountExplicitly(newAccount, null, null);
    }
    return newAccount;
}