public java.lang.Boolean putTransaction(pl.rodia.jopama.data.ObjectId transactionId, pl.rodia.jopama.data.ExtendedTransaction extendedTransaction) {
    assert extendedTransaction != null;
    assert (extendedTransaction.transaction) != null;
    pl.rodia.jopama.data.ExtendedTransaction oldExtendedTransaction = this.getTransaction(transactionId);
    this.transactions.put(transactionId, extendedTransaction);
    pl.rodia.jopama.core.LocalStorageImpl.logger.info(((((("putTransaction, updating(" + (!(extendedTransaction.equals(oldExtendedTransaction)))) + ") transactionId: ") + transactionId) + " transaction: ") + extendedTransaction));
    return !(extendedTransaction.equals(oldExtendedTransaction));
}