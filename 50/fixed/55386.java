public void createWithdrawal(java.lang.String name, java.lang.String account, java.lang.Double amount, java.lang.String category, java.lang.String date) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    createTransaction(name, account, TType.WITHDRAWAL, (-amount), category, date);
}