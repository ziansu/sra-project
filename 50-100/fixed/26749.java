@org.junit.Test(expected = java.io.IOException.class)
public void testConnectClosedConnection() throws java.lang.Exception {
    java.sql.Connection connectionMock = org.mockito.Mockito.mock(java.sql.Connection.class);
    org.mockito.Mockito.when(connectionMock.isClosed()).thenReturn(true);
    org.mockito.Mockito.when(runtimeContainerMock.getComponentData(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString())).thenReturn(connectionMock);
    this.snowflakeSourceOrSink.connect(runtimeContainerMock);
}