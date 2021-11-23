@org.testng.annotations.Test
public void shouldReturnConnectionWithProxy() throws java.io.IOException {
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT, false);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    org.mockito.Mockito.verify(httpURLConnection).addRequestProperty(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString());
}