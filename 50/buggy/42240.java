@java.lang.Override
public void sendPacketToAllClients(net.ilexiconn.netconn.server.IPacket packet) {
    for (java.net.Socket client : aliveClients) {
        sendPacketToClient(packet, client);
    }
}