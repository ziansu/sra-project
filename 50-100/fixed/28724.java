@org.junit.Test
public void testContainsOtherHeaders() throws java.lang.Exception {
    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headers = new java.util.HashMap<>();
    headers.put("content-type", java.util.Arrays.asList("application/octetstream"));
    org.dmfs.httpessentials.headers.Headers testHeaders = new org.dmfs.httpessentials.httpurlconnection.HttpUrlConnectionHeaders(headers);
    junit.framework.TestCase.assertFalse(testHeaders.contains(HttpHeaders.LINK));
}