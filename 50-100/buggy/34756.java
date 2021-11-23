public com.lody.virtual.server.accounts.VAccount getAccount(int userId, java.lang.String accountName, java.lang.String accountType) {
    java.util.List<com.lody.virtual.server.accounts.VAccount> accounts = accountsByUserId.get(userId);
    if (accounts != null) {
        for (com.lody.virtual.server.accounts.VAccount account : accounts) {
            if ((android.text.TextUtils.equals(account.name, accountName)) && (android.text.TextUtils.equals(account.type, accountType))) {
                return account;
            }
        }
    }
    return null;
}