@org.testng.annotations.Test
public void shouldUseNoProxyConnectionByDefault() throws java.io.IOException {
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT, false);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT, true);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithoutProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT, false);
    org.mockito.Mockito.verify(spyHttpTransport, org.mockito.Mockito.times(2)).getConnectionWithProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
}