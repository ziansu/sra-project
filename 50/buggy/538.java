@java.lang.Override
public java.net.InetSocketAddress getChainedProxyAddress() {
    try {
        return new java.net.InetSocketAddress(java.net.InetAddress.getByName(this.upstreamProxyHost), this.upstreamProxyPort);
    } catch (java.net.UnknownHostException uhe) {
        throw new java.lang.RuntimeException("Unable to resolve host?!", e);
    }
}