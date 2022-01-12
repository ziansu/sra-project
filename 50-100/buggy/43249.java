public void sendPacket(com.secarp.protocol.Packet packet, com.secarp.address.Ipv4Address targetIpv4Address) {
    com.secarp.address.MacAddress targetAddress;
    while ((targetAddress = this.arpCache.lookup(targetIpv4Address)) != null) {
        com.secarp.protocol.Packet arpRequestPacket = this.arp.createRequestPacket(this.macAddress, this.ipv4Address, targetIpv4Address);
        this.sendPacket(arpRequestPacket, com.secarp.address.MacAddress.getBroadcast());
        java.util.Timer.sleep(1000);
    } 
    this.sendPacket(packet, targetAddress);
}