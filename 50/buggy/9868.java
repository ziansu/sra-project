public boolean peerDiscovery() {
    if (prop.isEmpty())
        return true;
    
    return java.lang.Boolean.parseBoolean(prop.getProperty("peer.discovery"));
}