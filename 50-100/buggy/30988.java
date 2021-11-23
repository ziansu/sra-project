@java.lang.Override
public void createBuffer() {
    buffer = java.nio.ByteBuffer.allocate(((base.game.network.packets.TCP.PlayRequestPacket.dimension) + 1));
    buffer.clear();
    buffer.put(((byte) (-127)));
    buffer.put(shipID);
    buffer.rewind();
}