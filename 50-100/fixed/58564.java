@org.junit.Test
public void countWithExceptionReturnsZero() throws java.io.IOException, java.net.URISyntaxException, org.apache.http.client.ClientProtocolException, org.xwiki.component.manager.ComponentLookupException {
    org.mockito.Mockito.when(this.client.execute(org.mockito.Matchers.any(org.apache.http.client.methods.HttpUriRequest.class))).thenThrow(new java.io.IOException());
    long result = this.mocker.getComponentUnderTest().count(new java.util.HashMap<java.lang.String, java.lang.Object>());
    org.junit.Assert.assertEquals((-1), result);
}