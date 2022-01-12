public boolean readPacket() {
    try {
        com.techjar.network.Packet packet = com.techjar.network.Packet.readPacket(inputStream, netHandler.isServer());
        if (packet != null) {
            recieveQueue.add(packet);
            java.lang.System.out.println(packet.getId());
            return true;
        }else
            shutdown("Reached end of stream!");
        
    } catch (java.lang.Exception ex) {
        networkError(ex);
    }
    return false;
}