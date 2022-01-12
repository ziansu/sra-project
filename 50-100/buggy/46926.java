public int closeAccount(java.lang.String accountNumber) {
    if ((account.get(accountNumber)) != null) {
        int restBalance = account.get(accountNumber).getBalance();
        account.remove(accountNumber);
        return restBalance;
    }
    return 0;
}