void finishClose() {
    selectionKey.cancel();
    try {
        socketChannel.close();
    } catch (java.io.IOException e) {
    }
    status = com.xqbase.tuna.Client.STATUS_CLOSED;
}