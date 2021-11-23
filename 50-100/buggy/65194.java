public double getAccountBalance(java.lang.String accID) {
    java.util.ArrayList<Bank> bankList = getBankList();
    for (Bank b : bankList) {
        java.util.ArrayList<Account> accs = b.getAccounts();
        for (Account a : accs) {
            if ((a.getID()) == accID) {
                return a.getValue();
            }
        }
    }
    return 0;
}