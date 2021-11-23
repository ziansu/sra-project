@org.junit.Test
public void testDataFrame() throws java.lang.Exception {
    http2Connect();
    sendSimplePostRequest(3);
    readSimplePostResponse();
    org.junit.Assert.assertEquals(("0-WindowSize-[128]\n" + ((((("3-WindowSize-[128]\n" + "3-HeadersStart\n") + "3-Header-[:status]-[200]\n") + "3-HeadersEnd\n") + "3-Body-128\n") + "3-EndOfStream\n")), output.getTrace());
}