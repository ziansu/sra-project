private static void writeOutgoingPacket(javax.servlet.http.HttpServletResponse resp) throws java.io.IOException {
    java.io.OutputStream outputStream = resp.getOutputStream();
    final org.apache.nifi.remote.protocol.DataPacket packet = new org.apache.nifi.remote.client.http.TestHttpClient.DataPacketBuilder().contents("Example contents from server.").attr("Server attr 1", "Server attr 1 value").attr("Server attr 2", "Server attr 2 value").build();
    new org.apache.nifi.remote.codec.StandardFlowFileCodec().encode(packet, outputStream);
    outputStream.flush();
    resp.flushBuffer();
}