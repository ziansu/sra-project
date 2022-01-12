@org.junit.Test
public void testSendSearchRequest_timeout() {
    eu.h2020.symbiote.communication.RabbitManager rabbitManager = spy(new eu.h2020.symbiote.communication.RabbitManager());
    doReturn(null).when(rabbitManager).sendRpcMessage(any(), any(), any());
    eu.h2020.symbiote.model.QueryRequest request = new eu.h2020.symbiote.model.QueryRequest();
    java.util.List<eu.h2020.symbiote.model.Resource> response = rabbitManager.sendSearchRequest(request);
    assertNull(response);
}