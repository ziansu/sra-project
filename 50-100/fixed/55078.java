private edu.manatriya.banking.akunbanking.Account getValidAccount(java.lang.String accountID, java.lang.String password) throws java.lang.Exception {
    java.lang.String filename = ("out\\Accounts\\" + accountID) + ".acc";
    java.io.File f = new java.io.File(filename);
    if (f.exists()) {
        edu.manatriya.banking.akunbanking.AccountFactory accountFactory = new edu.manatriya.banking.akunbanking.AccountFactory();
        return accountFactory.getAccount(filename);
    }else
        return null;
    
}