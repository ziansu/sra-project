@java.lang.Override
public void rstStream(int streamId, com.squareup.okhttp.internal.spdy.ErrorCode errorCode) {
    finishStream(streamId, io.grpc.transport.okhttp.OkHttpClientTransport.toGrpcStatus(errorCode), null);
}