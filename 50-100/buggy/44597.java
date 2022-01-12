public int deposit(client.Bank bank, int money) {
    if (money > (asset))
        return 1;
    
    if ((money <= 0) || (!(bank.deposit(getAccountNumber(bank), money)))) {
        java.lang.System.out.println("입금 실패!");
        return 2;
    }
    asset -= money;
    return 0;
}