private static void addPacketTypes(com.comphenix.protocol.reflect.ObjectEnum<com.comphenix.protocol.PacketType> packetTypes, java.lang.String prefix, java.lang.Boolean isServer) {
    java.util.Iterator<com.comphenix.protocol.PacketType> packetTypeIterator = packetTypes.iterator();
    while (packetTypeIterator.hasNext()) {
        com.comphenix.protocol.PacketType current = packetTypeIterator.next();
        java.lang.String fullname = (((prefix + "_") + (isServer ? "SERVER" : "CLIENT")) + "_") + (current.name().toUpperCase());
        com.pie.tlatoani.ProtocolLib.UtilPacketEvent.nametoptype.put(fullname, current);
    } 
}