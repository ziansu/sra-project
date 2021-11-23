public boolean repayOnAccount(java.lang.String accountNumber, int money) {
    bank.Account selectedAccount = account.get(accountNumber);
    boolean isDone = selectedAccount.repayOnAccount(money);
    selectedAccount.addStateList(((((("대출상환금액 : " + money) + " 남은 대출금 : ") + (selectedAccount.getDebt())) + "은행잔고 : ") + (selectedAccount.getBalance())));
    return isDone;
}