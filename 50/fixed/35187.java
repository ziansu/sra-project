void enableKeepAlive(boolean enable, long keepAliveDelayNanos, long keepAliveTimeoutNanos) {
    enableKeepAlive = enable;
    this.keepAliveDelayNanos = keepAliveDelayNanos;
    this.keepAliveTimeoutNanos = keepAliveTimeoutNanos;
}