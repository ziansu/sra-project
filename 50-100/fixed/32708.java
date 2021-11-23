@org.junit.Test(expected = org.bonitasoft.engine.transaction.STransactionCreationException.class)
public void doNotSupportNestedCalls() throws java.lang.Exception {
    when(txManager.getStatus()).thenReturn(Status.STATUS_ACTIVE);
    when(txManager.getTransaction()).thenReturn(mock(javax.transaction.Transaction.class));
    org.bonitasoft.engine.transaction.JTATransactionServiceImpl txService = new org.bonitasoft.engine.transaction.JTATransactionServiceImpl(logger, txManager);
    txService.begin();
    txService.begin();
}