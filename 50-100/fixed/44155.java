private void sendBufferToClients() {
    synchronized(messagePacket) {
        if ((messagePacket.size()) > 0) {
            totalEventsCount += messagePacket.size();
            for (int i = 0; i < (clientList.size()); i++) {
                clientList.get(i).sendMessagePacket(messagePacket);
            }
        }
        messagePacket.clear();
    }
}