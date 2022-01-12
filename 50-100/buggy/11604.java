public static bar.f0o.jlisp.lib.Net.IPPacket fromByteArray(byte[] packet) throws java.lang.RuntimeException {
    if ((packet.length) < 20)
        throw new java.lang.RuntimeException("Payload too short for IP");
    
    if (((packet[0]) >> 4) == 4)
        return new bar.f0o.jlisp.lib.Net.IPv4Packet(packet);
    else
        if (((packet[0]) >> 4) == 6)
            return new bar.f0o.jlisp.lib.Net.IPv6Packet(packet);
        else {
            throw new java.lang.RuntimeException(("Illegal IP version number: " + (packet[0])));
        }
    
}