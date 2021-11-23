public java.lang.String net_peerCount() {
    int n = channelManager.getActivePeers().size();
    java.lang.String s = org.ethereum.jsonrpc.TypeConverter.TypeConverter.toJsonHex(n);
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("net_peerCount(): " + s));
    
    return s;
}