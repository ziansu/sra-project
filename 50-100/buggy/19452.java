private void sendBufferToClients() {
    if ((messagePacket.size()) > 0) {
        for (int i = 0; i < (clientList.size()); i++) {
            clientList.get(i).sendMessagePacket(messagePacket);
            java.lang.System.out.println(("buffer sent:" + (messagePacket.size())));
        }
    }
    messagePacket.clear();
}