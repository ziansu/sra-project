public static dev.wolveringer.bungeeutil.packets.creator.AbstractPacketCreator getCreator() {
    if ((dev.wolveringer.bungeeutil.packets.Packet.creator) == null) {
        dev.wolveringer.bungeeutil.packets.Packet.creator = new dev.wolveringer.bungeeutil.packets.creator.NormalPacketCreator();
    }
    return dev.wolveringer.bungeeutil.packets.Packet.creator;
}