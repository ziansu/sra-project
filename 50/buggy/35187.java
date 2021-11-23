@io.grpc.ExperimentalApi(value = "https://github.com/grpc/grpc-java/issues/1785")
void enableKeepAlive(boolean enable, long keepAliveDelayNanos, long keepAliveTimeoutNanos) {
    enableKeepAlive = enable;
    if (enable) {
        this.keepAliveDelayNanos = keepAliveDelayNanos;
        this.keepAliveTimeoutNanos = keepAliveTimeoutNanos;
    }
}