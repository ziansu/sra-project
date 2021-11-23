@org.junit.Test(expected = org.bonitasoft.engine.transaction.STransactionCreationException.class)
public void doNotSupportNestedCalls() throws java.lang.Exception {
    org.bonitasoft.engine.log.technical.TechnicalLoggerService logger = org.mockito.Mockito.mock(org.bonitasoft.engine.log.technical.TechnicalLoggerService.class);
    javax.transaction.TransactionManager txManager = org.mockito.Mockito.mock(javax.transaction.TransactionManager.class);
    org.mockito.Mockito.when(txManager.getStatus()).thenReturn(Status.STATUS_ACTIVE);
    org.mockito.Mockito.when(txManager.getTransaction()).thenReturn(org.mockito.Mockito.mock(javax.transaction.Transaction.class));
    org.bonitasoft.engine.transaction.JTATransactionServiceImpl txService = new org.bonitasoft.engine.transaction.JTATransactionServiceImpl(logger, txManager);
    txService.begin();
    txService.begin();
}