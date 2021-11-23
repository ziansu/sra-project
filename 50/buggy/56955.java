public boolean isTransactional() {
    return (!(readOnly)) && (transactionsEnabled);
}