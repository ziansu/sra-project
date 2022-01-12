public engine.network.packet.Packet getContentPacket(int offset, int size) {
    engine.network.packet.Packet out = getContentPacket(size);
    for (int i = 0; i < size; i++) {
        out.putByte(i, getByte((offset + i)));
    }
    return out;
}