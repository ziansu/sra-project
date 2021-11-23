public org.neo4j.ogm.transaction.Transaction openTransaction(org.neo4j.ogm.transaction.Transaction.Type type) {
    if ((org.neo4j.ogm.session.transaction.DefaultTransactionManager.TRANSACTION_THREAD_LOCAL.get()) == null) {
        org.neo4j.ogm.session.transaction.DefaultTransactionManager.TRANSACTION_THREAD_LOCAL.set(driver.newTransaction(type, ((session) != null ? session.getLastBookmark() : null)));
    }else {
        ((org.neo4j.ogm.transaction.AbstractTransaction) (org.neo4j.ogm.session.transaction.DefaultTransactionManager.TRANSACTION_THREAD_LOCAL.get())).extend(type);
    }
    return org.neo4j.ogm.session.transaction.DefaultTransactionManager.TRANSACTION_THREAD_LOCAL.get();
}