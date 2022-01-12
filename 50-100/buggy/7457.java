public static org.opendaylight.genius.mdsalutil.packet.Ethernet createEthernetPacket(byte[] sourceMAC, byte[] targetMAC, org.opendaylight.genius.mdsalutil.packet.ARP arp) throws org.opendaylight.controller.liblldp.PacketException {
    org.opendaylight.genius.mdsalutil.packet.Ethernet ethernet = new org.opendaylight.genius.mdsalutil.packet.Ethernet();
    ethernet.setSourceMACAddress(sourceMAC);
    ethernet.setDestinationMACAddress(targetMAC);
    ethernet.setEtherType(EtherTypes.ARP.shortValue());
    ethernet.setPayload(arp);
    return ethernet;
}