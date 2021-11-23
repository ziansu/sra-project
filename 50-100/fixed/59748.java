@org.junit.Test
public void testSendSearchRequest_emptyResult() {
    eu.h2020.symbiote.communication.RabbitManager rabbitManager = spy(new eu.h2020.symbiote.communication.RabbitManager());
    doReturn("[]").when(rabbitManager).sendRpcMessage(any(), any(), any(), any());
    eu.h2020.symbiote.model.QueryRequest request = new eu.h2020.symbiote.model.QueryRequest();
    java.util.List<eu.h2020.symbiote.model.Resource> response = rabbitManager.sendSearchRequest(request);
    assertNotNull(response);
    assertTrue((response instanceof java.util.List));
    assertEquals(0, response.size());
}