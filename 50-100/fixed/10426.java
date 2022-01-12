@org.junit.Test
public void testList() {
    java.util.List<java.net.Proxy> result = this.selector.select(TestUtil.HTTP_TEST_URI);
    org.junit.Assert.assertEquals(2, result.size());
    org.junit.Assert.assertEquals(TestUtil.HTTP_TEST_PROXY, result.get(0));
    org.junit.Assert.assertEquals(TestUtil.HTTPS_TEST_PROXY, result.get(1));
}