private void internalClose(io.grpc.Status status, io.grpc.Metadata trailers) {
    stream.close(status, trailers);
}