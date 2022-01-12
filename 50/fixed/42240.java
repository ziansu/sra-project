@java.lang.Override
public void sendPacketToAllClients(net.ilexiconn.netconn.server.IPacket packet) {
    for (java.net.Socket client : new java.util.ArrayList<java.net.Socket>(aliveClients)) {
        sendPacketToClient(packet, client);
    }
}