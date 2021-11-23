private static int getPacketLength(int id, essence.packet.PacketReader reader) {
    if (id > (talisman.packet.rs317.decode.RS317PacketMessageDecoder.sizes.length))
        return java.lang.Integer.MAX_VALUE;
    
    int possibleLength = talisman.packet.rs317.decode.RS317PacketMessageDecoder.sizes[id];
    if (possibleLength == (talisman.packet.rs317.decode.RS317PacketMessageDecoder.PACKET_SIZE_BYTE))
        return reader.readUnsignedByte();
    
    if (possibleLength == (talisman.packet.rs317.decode.RS317PacketMessageDecoder.PACKET_SIZE_SHORT))
        return reader.readShort();
    
    return possibleLength;
}