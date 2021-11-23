@java.lang.Override
public void decode(org.quartzpowered.network.buffer.Buffer buffer, org.quartzpowered.protocol.packet.play.client.BlockChangePacket packet) {
    packet.setLocation(buffer.readBlockPosition());
    int block = buffer.readVarInt();
    packet.setId((block << 4));
    packet.setData((block & 15));
}