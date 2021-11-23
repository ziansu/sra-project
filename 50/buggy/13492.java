public static dev.wolveringer.bungeeutil.packets.creator.AbstractPacketCreator getCreator() {
    if ((dev.wolveringer.bungeeutil.packets.Packet.creator) == null) {
        dev.wolveringer.bungeeutil.packets.Packet.creator = new dev.wolveringer.bungeeutil.packets.creator.CachedPacketCreator(new dev.wolveringer.bungeeutil.packets.creator.NormalPacketCreator(), 12);
    }
    return dev.wolveringer.bungeeutil.packets.Packet.creator;
}