@org.junit.Test
public void givenServerApp_whenExecutingARequest_thenTheRequestShouldBeInterceptedBeforeCallingTheHandler() throws java.lang.Exception {
    serverApp.registerHandler(com.progressoft.brix.domino.api.server.TestRequest.class.getCanonicalName(), new com.progressoft.brix.domino.api.server.TestRequestHandler());
    serverApp.registerInterceptor(com.progressoft.brix.domino.api.server.TestRequest.class.getCanonicalName(), com.progressoft.brix.domino.api.server.TestServerEntryPointContext.class.getCanonicalName(), new com.progressoft.brix.domino.api.server.TestInterceptor());
    com.progressoft.brix.domino.api.server.TestResponse response = ((com.progressoft.brix.domino.api.server.TestResponse) (serverApp.executeRequest(request, new com.progressoft.brix.domino.api.server.TestServerEntryPointContext())));
    org.junit.Assert.assertEquals("-intercepted-entry-point-parameter-handled", request.getTestWord());
}