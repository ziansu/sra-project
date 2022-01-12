private static io.grpc.StatusRuntimeException toException(com.google.rpc.Status status) {
    com.google.rpc.Status grpcStatus = io.grpc.Status.fromCodeValue(status.getCode()).withDescription(status.getMessage());
    for (com.google.protobuf.Any detail : status.getDetailsList()) {
        grpcStatus = grpcStatus.augmentDescription(detail.toString());
    }
    return grpcStatus.asRuntimeException();
}