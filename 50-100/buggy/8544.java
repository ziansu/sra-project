@org.junit.Test
public void getNumberOfConnectorImplementations_should_return_count() throws java.lang.Exception {
    final java.util.List<org.bonitasoft.engine.core.connector.parser.SConnectorImplementationDescriptor> sConnectorImplementationDescriptors = createConnectorList();
    doReturn(((long) (sConnectorImplementationDescriptors.size()))).when(connectorService).getNumberOfConnectorImplementations(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.PROCESS_DEFINITION_ID, org.bonitasoft.engine.api.impl.ProcessAPIImplTest.TENANT_ID);
    final long numberOfConnectorImplementations = processAPI.getNumberOfConnectorImplementations(org.bonitasoft.engine.api.impl.ProcessAPIImplTest.PROCESS_DEFINITION_ID);
    org.assertj.core.api.Assertions.assertThat(numberOfConnectorImplementations).as("should return count").isEqualTo(sConnectorImplementationDescriptors.size());
}