@org.junit.Test
public void testGetBodyHttpResponseWithoutBody() throws java.lang.Exception {
    com.andreistraut.drp.core.communicator.RequestTranslator translator = new com.andreistraut.drp.core.communicator.RequestTranslator();
    org.apache.http.HttpResponse response = new org.apache.http.impl.DefaultHttpResponseFactory().newHttpResponse(new org.apache.http.ProtocolVersion(io.netty.handler.codec.http.HttpVersion.HTTP, 1, 0), HttpResponseStatus.OK.code(), org.apache.http.protocol.HttpCoreContext.create());
    exception.expect(java.lang.IllegalArgumentException.class);
    exception.expectMessage("Entity may not be null");
    org.junit.Assert.assertTrue("Request body value was present when it shouldn't have been", (!(translator.getBody(response).isPresent())));
}