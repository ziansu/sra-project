public boolean updateTransferAmount(java.lang.String accID, double amount) {
    java.util.ArrayList<Bank> bankList = getBankList();
    for (Bank b : bankList) {
        java.util.ArrayList<Account> accs = b.getAccounts();
        for (Account a : accs) {
            if (a.getID().equals(accID)) {
                a.updateTransferAmount(amount);
                return Database.updateBank(b);
            }
        }
    }
    return false;
}