public com.abc.Account getAccount(java.lang.String acountType) {
    com.abc.Account account = null;
    for (com.abc.Account a : accounts) {
        if ((a.getAccountType()) == acountType) {
            account = a;
            break;
        }else {
            throw new java.lang.IllegalArgumentException("You do not have that account");
        }
    }
    return account;
}