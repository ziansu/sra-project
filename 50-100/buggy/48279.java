public java.util.List<com.coinblesk.payments.models.TransactionWrapper> getTransactionsByTime() {
    final java.util.List<com.coinblesk.payments.models.TransactionWrapper> transactions = new java.util.ArrayList<com.coinblesk.payments.models.TransactionWrapper>();
    for (org.bitcoinj.core.Transaction transaction : this.kit.wallet().getTransactionsByTime()) {
        transaction.setExchangeRate(getExchangeRate());
        transactions.add(new com.coinblesk.payments.models.TransactionWrapper(transaction, this.kit.wallet()));
    }
    return transactions;
}