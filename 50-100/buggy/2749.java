private void getFileByName(io.grpc.reflection.v1alpha.ServerReflectionRequest request) {
    java.lang.String name = request.getFileByFilename();
    com.google.protobuf.Descriptors.FileDescriptor fd = this.serverReflectionIndex.getFileDescriptorByName(name);
    if (fd != null) {
        serverCallStreamObserver.onNext(createServerReflectionResponse(request, fd));
    }else {
        sendErrorResponse(request, Status.NOT_FOUND, "File not found.");
    }
}