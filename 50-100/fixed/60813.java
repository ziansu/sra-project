@java.lang.Override
public void onClose(io.grpc.Status status, io.grpc.Metadata.Trailers trailers) {
    if (status.isOk()) {
        if ((value) == null) {
            responseFuture.setException(Status.INTERNAL.withDescription("No value received for unary call").asRuntimeException());
        }
        responseFuture.set(value);
    }else {
        responseFuture.setException(status.asRuntimeException());
    }
}