private static java.lang.String makeString(int packet, java.lang.String detail) {
    packets.InboundPackets packetType = null;
    if ((packet < 0) || (packet > (packets.InboundPackets.values().length)))
        packetType = packets.InboundPackets.values()[packet];
    
    return ("Packet error processing " + packetType) == null ? "UNKNOWN" : ((packetType.name()) + " : ") + detail;
}