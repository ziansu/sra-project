public void run() {
    java.lang.System.out.println("ARP recieving service started");
    while (!(this.isCloseRequested())) {
        jpcap.packet.ARPPacket packet = ((jpcap.packet.ARPPacket) (this.getNextBlockingPacket()));
        if (packet == null) {
            return ;
        }
        byte[] senderMac = packet.sender_hardaddr;
        byte[] senderIp = packet.sender_protoaddr;
        this.cache.add(senderMac, senderIp);
        java.lang.System.out.println(this.cache);
    } 
}