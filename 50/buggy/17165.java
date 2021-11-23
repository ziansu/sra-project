public com.teamfrugal.budgetapp.database.Transaction newTransact(java.lang.String name, java.lang.String amount, java.lang.String account, java.lang.String category, java.lang.String type, java.lang.String date) {
    com.teamfrugal.budgetapp.database.Transaction t = new com.teamfrugal.budgetapp.database.Transaction(name, amount, account, category, type, date);
    return t;
}