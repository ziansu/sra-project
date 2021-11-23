public void releaseLocks(Transaction t) {
    for (java.lang.String var : _lockTable.keySet()) {
        for (Lock lock : _lockTable.get(var)) {
            if (lock._transactionId.equals(t._tid)) {
                _lockTable.get(var).remove(lock);
                break;
            }
        }
    }
}