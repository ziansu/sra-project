private void normal() {
    RequestType r = validate.validate(receiveFromClient(PACKET_SIZE).getData());
    int clientPort = receivePacket.getPort();
    sendToServer();
    if (r == (RequestType.WRITE))
        receiveFromServer(ACK_PACKET_SIZE);
    else
        receiveFromServer(PACKET_SIZE);
    
    int serverThreadPort = receivePacket.getPort();
    sendToClient(clientPort);
    finishTransfer(r, clientPort, serverThreadPort);
}