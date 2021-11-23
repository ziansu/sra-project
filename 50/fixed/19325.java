@java.lang.Override
public void readPacket(final org.diorite.impl.connection.packets.PacketDataSerializer data) throws java.io.IOException {
    this.hash = data.readText(org.diorite.impl.connection.packets.play.serverbound.PacketPlayServerboundResourcePackStatus.MAX_HASH_SIZE);
    this.status = org.diorite.impl.connection.packets.play.serverbound.PacketPlayServerboundResourcePackStatus.ResourcePackStatus.values()[data.readVarInt()];
}