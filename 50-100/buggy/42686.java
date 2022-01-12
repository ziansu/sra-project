public void onFullTransaction(java.lang.Integer transId, java.lang.String tradesInMessage) {
    final com.fourcasters.forec.reconciler.server.persist.TradeTaskFactory.FullTask task = taskFactory.newFullReconciliationTask(tradesInMessage, this, transId);
    com.fourcasters.forec.reconciler.server.persist.TransactionManager.Transaction t = transactions.get(transId);
    if (t == null) {
        final java.util.Deque<java.lang.Runnable> tasks = new java.util.ArrayDeque<>(16);
        t = new com.fourcasters.forec.reconciler.server.persist.TransactionManager.Transaction(tasks);
        transactions.put(transId, t);
    }
    t.add(task);
    onTaskStart();
}