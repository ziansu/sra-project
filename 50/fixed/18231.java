public boolean contains(java.net.InetAddress inetAddress1) {
    return ((org.jboss.netty.handler.ipfilter.IpV4Subnet.toInt(inetAddress1)) & (mask)) == (subnet);
}