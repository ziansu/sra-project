public engine.network.packet.Packet getContentPacket() {
    engine.network.packet.Packet out = engine.network.packet.Packet.getNewContentPacket(Packet.MAX_PACKET_SIZE);
    out.iterator.putNextShortUnsigned(buff.getID());
    out.iterator.putNextInt(getDurationLeft());
    int mapSize = gndData.getMapSize();
    engine.network.packet.Packet gndContent = gndData.getContentPacket();
    out.iterator.putNextShortUnsigned((mapSize == 0 ? 0 : gndContent.getSize()));
    if (mapSize > 0)
        out.iterator.putNextContentPacket(gndData.getContentPacket());
    
    out.iterator.trimPacket();
    return out;
}