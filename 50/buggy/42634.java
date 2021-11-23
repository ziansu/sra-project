public net.tomp2p.peers.IP.IPv4 maskWithNetworkMaskInv(final int networkMask) {
    if (networkMask == 32) {
        return this;
    }else {
        return new net.tomp2p.peers.IP.IPv4(((bits) & (-1 >>> networkMask)));
    }
}