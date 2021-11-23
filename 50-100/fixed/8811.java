@java.lang.Override
public void forward(org.xbill.DNS.Message message, com.ahuazhu.soy.modal.ResponseContext response) throws java.io.IOException {
    org.xbill.DNS.Message answer = cache.getValue(new com.ahuazhu.soy.modal.QuestionKey(message));
    if (answer != null) {
        send(answer, response);
        return ;
    }
    if (forwarderStarted) {
        callBack.put(new com.ahuazhu.soy.modal.QueryKey(message), response);
        for (java.net.InetSocketAddress upstreamServer : upstreamServers) {
            datagramChannel.send(java.nio.ByteBuffer.wrap(message.toWire()), upstreamServer);
        }
    }
}