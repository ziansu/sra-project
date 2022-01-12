public java.lang.String getActivity(java.lang.String accID) {
    java.util.ArrayList<Bank> bankList = getBankList();
    for (Bank b : bankList) {
        java.util.ArrayList<Account> accs = b.getAccounts();
        for (Account a : accs) {
            if ((a.getID()) == accID) {
                java.lang.String toReturn = "";
                toReturn += "Beginning account activity report..." + "\n";
                return toReturn;
            }
        }
    }
    return "No account found.\n";
}