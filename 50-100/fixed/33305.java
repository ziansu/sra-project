public synchronized void search(org.physical_web.physicalweb.ssdp.SsdpMessage msg) throws java.io.IOException {
    if ((mDatagramSocket) != null) {
        byte[] bytes = msg.toString().getBytes();
        java.net.DatagramPacket dp = new java.net.DatagramPacket(bytes, bytes.length, mMulticastGroup);
        mDatagramSocket.send(dp);
    }
}