public void cancelSend(final com.vilyever.socketclient.helper.SocketPacket packet) {
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            synchronized(getSendingPacketQueue()) {
                if (self.getSendingPacketQueue().contains(packet)) {
                    self.getSendingPacketQueue().remove(packet);
                    self.__i__onSendPacketCancel(packet);
                }
            }
        }
    }).start();
}