@java.lang.Override
public boolean initialize() {
    assert (_transportProvider) != null;
    if ((_transportProvider) == null)
        return false;
    
    org.apache.cloudstack.framework.transport.TransportEndpointSite endpointSite = _transportProvider.attach(_transportEndpoint, "RpcProvider");
    endpointSite.registerMultiplexier(org.apache.cloudstack.framework.rpc.RpcProviderImpl.RPC_MULTIPLEXIER, this);
    return true;
}