public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.io.IOException {
    csc668assignment1.TransactionReader tr = new csc668assignment1.TransactionReader("Transactions.txt");
    while (tr.hasMoreTransactions()) {
        csc668assignment1.Transaction t = tr.getNextTransaction();
        java.lang.System.out.println("printing transactoin items");
        t.printTransItems();
    } 
}