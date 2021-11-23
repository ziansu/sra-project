private void testExpectedServiceFailureException(cz.muni.fi.pv168.OrderManagerImplTest.Operation<cz.muni.fi.pv168.OrderManager> operation) throws java.sql.SQLException {
    java.sql.SQLException sqlException = new java.sql.SQLException();
    javax.sql.DataSource failingDataSource = org.mockito.Mockito.mock(javax.sql.DataSource.class);
    org.mockito.Mockito.when(failingDataSource.getConnection()).thenThrow(sqlException);
    orderManager.setDataSource(failingDataSource);
    assertThatThrownBy(() -> operation.callOn(orderManager)).isInstanceOf(cz.muni.fi.pv168.ServiceFailureException.class);
}