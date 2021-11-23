public java.lang.String eth_protocolVersion() {
    int version = 0;
    for (org.ethereum.net.client.Capability capability : configCapabilities.getConfigCapabilities()) {
        if (capability.isEth()) {
            version = java.lang.Math.max(version, capability.getVersion());
        }
    }
    java.lang.String s = java.lang.Integer.toString(version);
    if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
        org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("eth_protocolVersion(): " + s));
    
    return s;
}