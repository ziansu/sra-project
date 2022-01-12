public java.lang.String net_peerCount() {
    java.lang.String s = null;
    try {
        int n = channelManager.getActivePeers().size();
        return s = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(n);
    } finally {
        if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
            org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("net_peerCount(): " + s));
        
    }
}