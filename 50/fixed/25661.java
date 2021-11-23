public boolean loan(client.Bank bank, int money) {
    if (bank.loan(getAccountNumber(bank), money)) {
        this.asset += money;
        return true;
    }
    return false;
}