public boolean withdraw(java.lang.String accountNumber, int money) {
    bank.Account selectedAccount = account.get(accountNumber);
    boolean isDone = selectedAccount.withdraw(money);
    if (isDone)
        selectedAccount.addStateList(((("출금 : " + money) + " 잔액 : ") + (selectedAccount.getBalance())));
    
    return isDone;
}