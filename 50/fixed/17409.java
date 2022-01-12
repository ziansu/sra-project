public void setHost(java.lang.String host) {
    if (sun.net.util.IPAddressUtil.isIPv6LiteralAddress(host)) {
        this.host = java.lang.String.format("[%s]", host);
    }else {
        this.host = host;
    }
}