@java.lang.Override
public java.util.List<java.net.Proxy> select(java.net.URI uri) {
    return java.util.Arrays.asList(TestUtil.HTTP_TEST_PROXY, TestUtil.HTTPS_TEST_PROXY);
}