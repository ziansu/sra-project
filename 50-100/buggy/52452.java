private void getFileByExtension(io.grpc.reflection.v1alpha.ServerReflectionRequest request) {
    io.grpc.reflection.v1alpha.ExtensionRequest extensionRequest = request.getFileContainingExtension();
    java.lang.String type = extensionRequest.getContainingType();
    int extension = extensionRequest.getExtensionNumber();
    com.google.protobuf.Descriptors.FileDescriptor fd = this.serverReflectionIndex.getFileDescriptorByExtensionAndNumber(type, extension);
    if (fd != null) {
        serverCallStreamObserver.onNext(createServerReflectionResponse(request, fd));
    }else {
        sendErrorResponse(request, Status.NOT_FOUND, "Extension not found.");
    }
}