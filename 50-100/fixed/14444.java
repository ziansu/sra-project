public java.lang.String eth_protocolVersion() {
    java.lang.String s = null;
    try {
        int version = 0;
        for (org.ethereum.net.client.Capability capability : configCapabilities.getConfigCapabilities()) {
            if (capability.isEth()) {
                version = java.lang.Math.max(version, capability.getVersion());
            }
        }
        return s = java.lang.Integer.toString(version);
    } finally {
        if (org.ethereum.jsonrpc.JsonRpcImpl.logger.isDebugEnabled())
            org.ethereum.jsonrpc.JsonRpcImpl.logger.debug(("eth_protocolVersion(): " + s));
        
    }
}