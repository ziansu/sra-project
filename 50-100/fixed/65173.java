@org.junit.Test
public void beginTransaction() throws java.lang.Exception {
    org.mockito.Mockito.when(txManager.getStatus()).thenReturn(Status.STATUS_NO_TRANSACTION).thenReturn(Status.STATUS_ACTIVE);
    org.mockito.Mockito.when(txManager.getTransaction()).thenReturn(org.mockito.Mockito.mock(javax.transaction.Transaction.class));
    txService.begin();
    org.mockito.Mockito.verify(txManager, org.mockito.Mockito.times(1)).begin();
    org.junit.Assert.assertEquals(1, txService.getNumberOfActiveTransactions());
}