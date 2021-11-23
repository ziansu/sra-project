@org.testng.annotations.Test
public void shouldReturnConnectionWithoutProxy() throws java.io.IOException {
    spyHttpTransport.openConnection(com.codenvy.im.utils.TestHttpTransport.TEXT, com.codenvy.im.utils.TestHttpTransport.TEXT, true);
    org.mockito.Mockito.verify(spyHttpTransport).getConnectionWithoutProxy(com.codenvy.im.utils.TestHttpTransport.TEXT);
    org.mockito.Mockito.verify(httpURLConnection).addRequestProperty(org.mockito.Matchers.anyString(), org.mockito.Matchers.anyString());
}