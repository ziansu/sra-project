public com.fh.entity.TransactionsBeans updateZoningTransaction(com.fh.entity.TransactionsBeans transactions, int status) throws java.lang.Exception {
    com.fh.entity.TransactionsBeans transactionsBeans = transactions;
    if (transactionsBeans != null) {
        transactionsBeans.setPrev_status(transactionsBeans.getStatus());
        transactionsBeans.setStatus(status);
        this.saveAndupdateTransaction(transactionsBeans, status);
    }
    return transactionsBeans;
}