public void close() {
    for (java.nio.channels.SocketChannel socketChannel : channelMap.keySet()) {
        try {
            socketChannel.close();
        } catch (java.io.IOException e) {
            com.fsneak.shadowsocks.log.Logger.error(e);
        }
    }
    stage = com.fsneak.shadowsocks.session.Session.Stage.CLOSE;
    channelMap.clear();
}