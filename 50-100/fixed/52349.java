@org.junit.Test(expected = org.bonitasoft.engine.exception.RetrieveException.class)
public void getConnectorsImplementations_should_throw__exception() throws java.lang.Exception {
    final org.bonitasoft.engine.core.connector.exception.SConnectorException sConnectorException = new org.bonitasoft.engine.core.connector.exception.SConnectorException("message");
    doThrow(sConnectorException).when(connectorService).getConnectorImplementations(anyLong(), anyLong(), anyInt(), anyInt(), anyString(), any(org.bonitasoft.engine.persistence.OrderByType.class));
    processAPI.getConnectorImplementations(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.PROCESS_DEFINITION_ID, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.START_INDEX, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.MAX_RESULT, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.CONNECTOR_CRITERION_DEFINITION_ID_ASC);
}