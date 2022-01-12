@java.lang.Override
public void messageReceived(org.elasticsearch.transport.AbstractSimpleTransportTestCase.Version1Request request, org.elasticsearch.transport.TransportChannel channel) throws java.lang.Exception {
    assertThat(request.value1, org.hamcrest.Matchers.equalTo(1));
    assertThat(request.value2, org.hamcrest.Matchers.equalTo(0));
    org.elasticsearch.transport.AbstractSimpleTransportTestCase.Version1Response response = new org.elasticsearch.transport.AbstractSimpleTransportTestCase.Version1Response();
    response.value1 = 1;
    response.value2 = 2;
    channel.sendResponse(response);
}