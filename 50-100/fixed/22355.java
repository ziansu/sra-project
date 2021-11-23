public double getLoanAmount(java.lang.String accID) {
    java.util.ArrayList<Bank> bankList = getBankList();
    for (Bank b : bankList) {
        java.util.ArrayList<Account> accs = b.getAccounts();
        for (Account a : accs) {
            if (a.getID().equals(accID)) {
                return a.getLoansValue();
            }
        }
    }
    return 0;
}