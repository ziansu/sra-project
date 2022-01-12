public void cancelSend(final com.vilyever.socketclient.helper.SocketPacket packet) {
    if ((android.os.Looper.myLooper()) == (android.os.Looper.getMainLooper())) {
        new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                self.cancelSend(packet);
            }
        }).start();
        return ;
    }
    synchronized(getSendingPacketQueue()) {
        if (getSendingPacketQueue().contains(packet)) {
            getSendingPacketQueue().remove(packet);
            __i__onSendPacketCancel(packet);
        }
    }
}