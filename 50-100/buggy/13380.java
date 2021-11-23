int processPacket(com.ds2016.Packet packet) {
    if ((packet.destination) == (ID)) {
        return 1;
    }
    java.lang.Integer nxt = nextHop(packet);
    if (nxt != null) {
        slowQ.putIfAbsent(nxt, new java.util.ArrayDeque<>());
        slowQ.get(nxt).push(packet);
    }else
        java.lang.System.out.println("Packet dropped...");
    
    return 0;
}