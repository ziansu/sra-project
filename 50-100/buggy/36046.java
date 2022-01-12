@org.testng.annotations.Test
public void shouldUseNoProxyConnectionByDefault() throws java.io.IOException {
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    spyHttpTransport.noProxy();
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithoutProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT);
    org.mockito.Mockito.verify(spyHttpTransport, org.mockito.Mockito.times(2)).getConnectionWithProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
}