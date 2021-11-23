private void disconnectSocket() {
    if ((mSocket) != null) {
        showAnimationDisconnectedIfNotVisible();
        historyAdapter.addAtFront(new ch.abertschi.flashonvisit.HistoryEntry(java.lang.String.format("Leaving <b>%s</b>", getChannelName())));
        mSocket.disconnect();
        mSocket.off("connect", onConnectEvent);
        mSocket.off("disconnect", onDisconnectEvent);
        mSocket.off("flash", onFlashEvent);
        mSocket = null;
    }
}