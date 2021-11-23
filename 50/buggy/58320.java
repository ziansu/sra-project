@java.lang.Override
public com.microsoft.azure.management.network.implementation.ApplicationGatewayImpl withoutDisabledSslProtocols(com.microsoft.azure.management.network.ApplicationGatewaySslProtocol... protocols) {
    if (protocols == null) {
        return null;
    }else {
        for (com.microsoft.azure.management.network.ApplicationGatewaySslProtocol protocol : protocols) {
            this.withoutDisabledSslProtocol(protocol);
        }
    }
    return this;
}