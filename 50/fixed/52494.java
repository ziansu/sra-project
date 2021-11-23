public long getAccountBalanceByIndex(int index) throws java.lang.IllegalArgumentException, java.lang.IndexOutOfBoundsException {
    if (!(checkAccountExistenceByIndex(index))) {
        throw new java.lang.IndexOutOfBoundsException(ua.yandex.bank.Bank.TOO_BIG_ACCOUNT_INDEX_MSG);
    }
    return accountList.get(index).getBalance();
}