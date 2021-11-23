public boolean login(java.lang.String username, java.lang.String password) {
    try {
        transfer.SetPacketData packet = new transfer.SetPacketData(transfer.Packet.LOGIN, username);
        packet.setPassword(password);
        sendPacket(packet);
        transfer.Packet receivedPacket;
        receivedPacket = ((transfer.Packet) (in.readObject()));
        if ((receivedPacket.TYPE) == (transfer.Packet.AUTH_SUCCESSFUL)) {
            authSuccess();
        }
    } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
        java.lang.System.err.println("[Client_login]");
    }
    return isAuth;
}