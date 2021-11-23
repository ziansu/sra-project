public static java.lang.String getEmail(android.content.Context context) {
    android.accounts.AccountManager accountManager = android.accounts.AccountManager.get(context);
    java.lang.String account = com.mysjsu.mobsecurity.UserDataUtil.getAccount(accountManager);
    if (account == null) {
        return null;
    }else {
        return account;
    }
}