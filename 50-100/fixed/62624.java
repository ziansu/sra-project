private void getFileContainingSymbol(io.grpc.reflection.v1alpha.ServerReflectionRequest request) {
    java.lang.String symbol = request.getFileContainingSymbol();
    com.google.protobuf.Descriptors.FileDescriptor fd = serverReflectionIndex.getFileDescriptorBySymbol(symbol);
    if (fd != null) {
        serverCallStreamObserver.onNext(createServerReflectionResponse(request, fd));
    }else {
        sendErrorResponse(request, Status.NOT_FOUND, "Symbol not found.");
    }
}