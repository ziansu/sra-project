@java.lang.Override
public long getEntityOwnerId() {
    return _accountService.getActiveAccountByName(accountName, domainId).getAccountId();
}