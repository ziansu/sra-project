protected void closeConncection(java.nio.channels.SelectionKey selectionKey) {
    try {
        selectionKey.channel().close();
    } catch (java.io.IOException e) {
    }
    selectionKey.cancel();
}