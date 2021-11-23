private void sendBufferToClients() {
    synchronized(messagePacket) {
        if ((messagePacket.size()) > 0) {
            totalEventsCount += messagePacket.size();
            java.lang.System.out.println(("Total sent:" + (totalEventsCount)));
            for (int i = 0; i < (clientList.size()); i++) {
                clientList.get(i).sendMessagePacket(messagePacket);
            }
        }
        messagePacket.clear();
    }
}