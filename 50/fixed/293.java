void state(transaction.TransactionManagerImpl.State state) {
    this.state = state;
    count.set(0);
    storeLog();
}