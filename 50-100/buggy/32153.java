public engine.network.packet.Packet getPacket(int offset, int size) {
    engine.network.packet.Packet out = engine.network.packet.Packet.getContentPacket(size);
    for (int i = 0; i < size; i++) {
        out.putByte(i, getByte((offset + i)));
    }
    return out;
}