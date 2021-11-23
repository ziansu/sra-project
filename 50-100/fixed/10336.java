public static void main(java.lang.String[] args) throws java.net.UnknownHostException {
    for (int i = 0; i < 10; i++) {
        java.lang.System.out.println(("Free port: " + (voip.NetUtils.findFreePort())));
    }
    java.net.InetAddress address = java.net.InetAddress.getByName("192.168.1.1");
    java.lang.System.out.println(address.toString());
    java.lang.System.out.println(voip.NetUtils.getIpByInetAddress(address));
    java.lang.System.out.println(voip.NetUtils.getLocalIpAddress());
}