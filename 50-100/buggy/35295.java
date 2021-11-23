public static org.totschnig.myexpenses.model.Transfer getNewInstance(long accountId, java.lang.Long transferAccountId, java.lang.Long parentId) {
    org.totschnig.myexpenses.model.Account account = org.totschnig.myexpenses.model.Account.getInstanceFromDbWithFallback(accountId);
    if (account == null) {
        return null;
    }
    org.totschnig.myexpenses.model.Account transferAccount = org.totschnig.myexpenses.model.Account.getInstanceFromDbWithFallback(transferAccountId);
    if (transferAccount == null) {
        return null;
    }
    return new org.totschnig.myexpenses.model.Transfer(accountId, new org.totschnig.myexpenses.model.Money(account.currency, 0L), transferAccountId, parentId);
}