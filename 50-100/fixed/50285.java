private void listServices(io.grpc.reflection.v1alpha.ServerReflectionRequest request) {
    io.grpc.reflection.v1alpha.ListServiceResponse.Builder builder = io.grpc.reflection.v1alpha.ListServiceResponse.newBuilder();
    for (java.lang.String serviceName : serverReflectionIndex.getServiceNames()) {
        builder.addService(io.grpc.reflection.v1alpha.ServiceResponse.newBuilder().setName(serviceName));
    }
    serverCallStreamObserver.onNext(io.grpc.reflection.v1alpha.ServerReflectionResponse.newBuilder().setValidHost(request.getHost()).setOriginalRequest(request).setListServicesResponse(builder).build());
}