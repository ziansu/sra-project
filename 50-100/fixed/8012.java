public engine.network.packet.Packet getContentPacket() {
    engine.network.packet.Packet out = engine.network.packet.Packet.getNewContentPacket(Packet.MAX_PACKET_SIZE);
    out.iterator.putNextShortUnsigned(buff.getID());
    out.iterator.putNextInt(getDurationLeft());
    int mapSize = gndData.getMapSize();
    if (mapSize == 0) {
        out.iterator.putNextShortUnsigned(0);
    }else {
        engine.network.packet.Packet gndContent = gndData.getContentPacket();
        out.iterator.putNextShortUnsigned(gndContent.getSize());
        out.iterator.putNextContentPacket(gndContent);
    }
    out.iterator.trimPacket();
    return out;
}