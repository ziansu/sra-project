MiniWebStoreAccount verifyUser(java.lang.String username, int password) {
    MiniWebStoreAccount account = findAccount(username);
    return account != null ? (account.getPasswordHash()) == password ? account : null : null;
}