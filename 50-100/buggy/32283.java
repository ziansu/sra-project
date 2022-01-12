@org.junit.Test
public void testHeaderFrameWithPadding() throws java.lang.Exception {
    http2Connect();
    byte[] padding = new byte[8];
    sendSimpleGetRequest(3, padding);
    readSimpleGetResponse();
    org.junit.Assert.assertEquals(getSimpleResponseTrace(3), output.getTrace());
    output.clearTrace();
}