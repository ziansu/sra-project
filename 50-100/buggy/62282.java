private discovery.Discovery.RegistryEntry resolveServer(java.lang.String serverName) {
    io.grpc.ManagedChannel channel = io.grpc.ManagedChannelBuilder.forAddress(discoveryHost, discoveryPort).usePlaintext(true).build();
    discovery.DiscoveryServiceGrpc.DiscoveryServiceBlockingStub blockingStub = discovery.DiscoveryServiceGrpc.newBlockingStub(channel);
    discovery.Discovery.RegistryEntry response;
    discovery.Discovery.RegistryEntry request = discovery.Discovery.RegistryEntry.newBuilder().setName("monitor").build();
    try {
        response = blockingStub.discover(request);
    } catch (io.grpc.StatusRuntimeException e) {
        java.lang.System.err.println("Unable to find monitor!");
        e.printStackTrace();
    }
    return response;
}