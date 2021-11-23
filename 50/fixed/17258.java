synchronized boolean isInitialConnectFinished() {
    com.google.common.base.Preconditions.checkNotNull(this.pending);
    return (this.pending.isDone()) && (this.pending.isSuccess());
}