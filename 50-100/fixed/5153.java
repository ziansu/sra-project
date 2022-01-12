@org.junit.Test
public void testSendResourceUrls_timeout() {
    eu.h2020.symbiote.communication.RabbitManager rabbitManager = spy(new eu.h2020.symbiote.communication.RabbitManager());
    doReturn(null).when(rabbitManager).sendRpcMessage(any(), any(), any(), any());
    eu.h2020.symbiote.model.ResourceUrlsRequest request = new eu.h2020.symbiote.model.ResourceUrlsRequest();
    request.setIdList(java.util.Collections.singletonList("123"));
    java.util.Map<java.lang.String, java.lang.String> response = rabbitManager.sendResourceUrlsRequest(request);
    assertNull(response);
}