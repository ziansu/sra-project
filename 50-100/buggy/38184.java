@org.junit.Test
public void testTransactionSynchronizationInManagedTransaction() throws java.lang.Exception {
    javax.transaction.Transaction transaction = org.mockito.Mockito.mock(org.bonitasoft.engine.transaction.MyTransactionManager.MyTransaction.class);
    javax.transaction.TransactionManager txManager = new org.bonitasoft.engine.transaction.MyTransactionManager(transaction);
    org.bonitasoft.engine.transaction.JTATransactionServiceImpl txService = new org.bonitasoft.engine.transaction.JTATransactionServiceImpl(logger, txManager);
    try {
        txService.begin();
    } finally {
        txService.complete();
    }
    org.mockito.Mockito.verify(transaction, org.mockito.Mockito.times(2)).registerSynchronization(org.mockito.Mockito.any(javax.transaction.Synchronization.class));
}