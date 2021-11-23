public static void main(java.lang.String[] args) {
    uk.ac.gla.atanaspam.pcapj.PacketGenerator p = new uk.ac.gla.atanaspam.pcapj.PacketGenerator("/Users/atanaspam/Documents/Versoned Projects/RTDCONN/partial.pcap", true, true);
    p.configure(new java.util.ArrayList<java.net.InetAddress>(), new java.util.ArrayList<java.net.InetAddress>(), new java.util.ArrayList<java.lang.Integer>(), new java.util.ArrayList<java.lang.Integer>(), new java.util.ArrayList<boolean[]>(), 2);
    for (int i = 0; i < 400; i++) {
        java.lang.System.out.println(p.getPacket());
    }
}