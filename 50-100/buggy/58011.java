private int parsePrefix(java.lang.Integer prefix) throws mx.nic.rdap.core.ip.IpAddressFormatException {
    if ((address) instanceof java.net.Inet4Address) {
        return mx.nic.rdap.core.ip.AddressBlock.parsePrefix(prefix, mx.nic.rdap.core.ip.AddressBlock.MAX_IPV6_CIDR);
    }
    if ((address) instanceof java.net.Inet6Address) {
        return mx.nic.rdap.core.ip.AddressBlock.parsePrefix(prefix, mx.nic.rdap.core.ip.AddressBlock.MAX_IPV4_CIDR);
    }
    throw new mx.nic.rdap.core.ip.IpAddressFormatException("Only IPv4 and IPv6 addresses are supported.");
}