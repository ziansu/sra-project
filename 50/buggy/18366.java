public static ch.rihuber.switchTestbench.Packet findPacket(java.util.LinkedList<java.lang.Integer> payload) {
    for (ch.rihuber.switchTestbench.Packet currentPacket : ch.rihuber.switchTestbench.Packet.packets) {
        if (currentPacket.isPayloadEqual(payload))
            return currentPacket;
        
    }
    return null;
}