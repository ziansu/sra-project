public static java.lang.String getEmail(android.content.Context context) {
    android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
    android.accounts.Account account = com.mysjsu.mobsecurity.UserDataUtil.getAccount(accountManager);
    if (account == null) {
        return null;
    }else {
        return account.name;
    }
}