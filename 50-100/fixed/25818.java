@java.lang.Override
public com.microsoft.azure.management.network.implementation.LoadBalancerImpl withLoadBalancingRule(int frontendPort, com.microsoft.azure.management.network.TransportProtocol protocol, int backendPort) {
    this.defineLoadBalancingRule(com.microsoft.azure.management.network.implementation.LoadBalancerImpl.DEFAULT).withFrontendPort(frontendPort).withDefaultFrontend().withBackendPort(backendPort).withDefaultBackend().withProtocol(protocol).attach();
    return this;
}