public void close() {
    try {
        for (java.nio.channels.SocketChannel socketChannel : channelMap.keySet()) {
            socketChannel.close();
        }
        channelMap.clear();
    } catch (java.io.IOException e) {
        com.fsneak.shadowsocks.log.Logger.error(e);
    } finally {
        stage = com.fsneak.shadowsocks.session.Session.Stage.CLOSE;
    }
}