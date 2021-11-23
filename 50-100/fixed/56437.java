public boolean repayOnAccount(java.lang.String accountNumber, int money) {
    bank.Account selectedAccount = account.get(accountNumber);
    if (!(selectedAccount.repayOnAccount(money)))
        return false;
    
    selectedAccount.addStateList(((((("대출상환금액 : " + money) + " 남은 대출금 : ") + (selectedAccount.getDebt())) + "은행잔고 : ") + (selectedAccount.getBalance())));
    return true;
}