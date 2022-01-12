public java.util.LinkedList<WMSLogic.Transaction> getAllTransactions() {
    java.util.LinkedList<WMSLogic.Transaction> transactionsToReturn = new java.util.LinkedList<>();
    WMSLogic.Transaction holder = new WMSLogic.Transaction();
    for (int i = 0; i < (WMSLogic.UserAccount.transactions.size()); i++) {
        holder = WMSLogic.UserAccount.transactions.getFirst();
        transactionsToReturn.add(holder);
    }
    return transactionsToReturn;
}