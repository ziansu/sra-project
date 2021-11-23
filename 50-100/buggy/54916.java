private void setAccount(android.accounts.Account account, boolean savedAccount) {
    android.accounts.Account oldAccount = mAccount;
    boolean validAccount = (account != null) && (com.owncloud.android.authentication.AccountUtils.setCurrentOwnCloudAccount(getApplicationContext(), account.name));
    if (validAccount) {
        mAccount = account;
        mAccountWasSet = true;
        mAccountWasRestored = savedAccount || (mAccount.equals(oldAccount));
    }else {
        swapToDefaultAccount();
    }
}