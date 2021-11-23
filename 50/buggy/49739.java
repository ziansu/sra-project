public void register(com.lucadev.mcprotocol.protocol.State state, int id, java.lang.Class<? extends com.lucadev.mcprotocol.protocol.packets.Packet> packet) {
    state.registerPacket(id, packet);
}