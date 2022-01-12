@java.lang.Override
public void deleteAccount(java.lang.String accountName) throws com.starbattle.accounts.manager.AccountException {
    accountCrud.deleteAccount(accountName, 0);
}