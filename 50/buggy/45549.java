public void transfer(client.Bank bank, java.lang.String toAccount, int money) {
    bank.transfer(getAccountNumber(bank), toAccount, money);
}