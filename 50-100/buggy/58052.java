private void privateDisconnect(boolean sendPacket) {
    if (((getSlot()) != (-1)) && sendPacket)
        sendPacket(engine.network.client.PacketDisconnect.clientDisconnect(getSlot(), disconnectMessage));
    
    if ((socket) != null)
        socket.close();
    
    if ((listenThread) != null)
        listenThread.interrupt();
    
    if ((getLevel()) != null)
        getLevel().dispose();
    
    hasDisconnected = true;
    engine.network.client.GlobalData.stopClient();
}