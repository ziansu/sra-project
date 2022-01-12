public Account add_account(java.lang.String firstName, java.lang.String lastName, java.lang.String username, java.lang.String email, java.lang.String Password) {
    (accountNo)++;
    Account account = new Account(accountNo, firstName, lastName, username, email, Password);
    AccountManager.Accounts.put(accountNo, account);
    return account;
}