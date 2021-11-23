public static java.net.InetAddress getFirstExternalNetwork4Address() {
    java.util.List<? extends java.net.InetAddress> addresses = org.apache.sshd.common.SshdSocketAddress.getExternalNetwork4Addresses();
    if ((org.apache.sshd.common.util.GenericUtils.size(addresses)) > 0)
        return addresses.get(0);
    else
        return null;
    
}