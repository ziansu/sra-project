public int deposit(client.Bank bank, int money) {
    if (money > (asset))
        return 1;
    
    if ((money <= 0) || (!(bank.deposit(getAccountNumber(bank), money))))
        return 2;
    
    asset -= money;
    return 0;
}