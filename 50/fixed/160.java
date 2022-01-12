public static java.net.InetAddress getFirstExternalNetwork4Address() {
    java.util.List<? extends java.net.InetAddress> addresses = org.apache.sshd.common.SshdSocketAddress.getExternalNetwork4Addresses();
    return (org.apache.sshd.common.util.GenericUtils.size(addresses)) > 0 ? addresses.get(0) : null;
}