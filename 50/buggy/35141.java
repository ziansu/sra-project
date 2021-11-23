public java.lang.String net_version() {
    java.lang.String s = eth_protocolVersion();
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("net_version(): " + s));
    
    return s;
}