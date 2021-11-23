@org.junit.Test
public void testFailedProxy() {
    this.selector.connectFailed(TestUtil.HTTP_TEST_URI, TestUtil.HTTP_TEST_PROXY.address(), new java.io.IOException("TEST"));
    java.util.List<java.net.Proxy> result = this.selector.select(TestUtil.HTTP_TEST_URI);
    org.junit.Assert.assertEquals(TestUtil.HTTPS_TEST_PROXY, result.get(0));
    org.junit.Assert.assertEquals(java.net.Proxy.NO_PROXY, result.get(1));
}