protected void openClientConnection() throws java.io.IOException {
    s = javax.net.SocketFactory.getDefault().createSocket("localhost", getPort());
    s.setSoTimeout(30000);
    os = s.getOutputStream();
    java.io.InputStream is = s.getInputStream();
    input = new org.apache.coyote.http2.Http2TestBase.TestInput(is);
    output = new org.apache.coyote.http2.Http2TestBase.TestOutput();
    parser = new org.apache.coyote.http2.Http2Parser("-1", input, output);
    hpackEncoder = new org.apache.coyote.http2.HpackEncoder();
}