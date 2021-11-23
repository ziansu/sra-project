@java.lang.Override
public java.util.List<com.microsoft.azure.management.network.ApplicationGatewayBackendAddress> backendAddresses() {
    java.util.List<com.microsoft.azure.management.network.ApplicationGatewayBackendAddress> addresses = new java.util.ArrayList<>();
    com.microsoft.azure.management.network.ApplicationGatewayBackend backend = this.backend();
    if ((backend != null) && ((backend.addresses()) != null)) {
        addresses = backend.addresses();
    }
    return java.util.Collections.unmodifiableList(addresses);
}