private void sendBufferToClients() {
    if ((messagePacket.size()) > 0) {
        for (int i = 0; i < (clientList.size()); i++) {
            clientList.get(i).sendMessagePacket(messagePacket);
        }
    }
    messagePacket.clear();
}