public void setAccount(edu.manatriya.banking.akunbanking.Account a) {
    if (a != null) {
        accountFileName = a.accountFileName;
        accountID = a.accountID;
        password = a.password;
        currency = a.currency;
        saldo = a.saldo;
        transactionHistory = new java.util.ArrayList<java.lang.String[]>(a.transactionHistory.size());
        transactionHistory.addAll(a.transactionHistory);
    }else {
        accountID = null;
        accountFileName = null;
        password = null;
        currency = null;
        saldo = 0;
        transactionHistory = null;
    }
}