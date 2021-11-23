private static void addPacketTypes(java.util.Iterator<com.comphenix.protocol.PacketType> packetTypeIterator, java.lang.String prefix, java.lang.Boolean isServer) {
    while (packetTypeIterator.hasNext()) {
        com.comphenix.protocol.PacketType current = packetTypeIterator.next();
        java.lang.String fullname = (((prefix + "_") + (isServer ? "SERVER" : "CLIENT")) + "_") + (current.name().toUpperCase());
        com.pie.tlatoani.ProtocolLib.UtilPacketEvent.nametoptype.put(fullname, current);
    } 
}