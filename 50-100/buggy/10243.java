private static void put(java.lang.Class<? extends net.tridentsdk.server.packet.Packet> cls, net.tridentsdk.server.net.NetClient.NetState state, net.tridentsdk.server.packet.Packet.Bound bound, int id) {
    int identifier = net.tridentsdk.server.packet.PacketRegistry.shift(state, bound, id);
    net.tridentsdk.server.packet.PacketRegistry.PACKETS.put(cls, identifier);
    net.tridentsdk.server.packet.PacketRegistry.PACKET_IDS.put(identifier, cls);
    if (bound == (net.tridentsdk.server.packet.Packet.Bound.SERVER)) {
        net.tridentsdk.server.packet.PacketRegistry.CTORS.put(cls, com.esotericsoftware.reflectasm.ConstructorAccess.get(cls));
    }
}