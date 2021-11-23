private void pushResetLater(final int streamId, final com.squareup.okhttp.internal.spdy.ErrorCode errorCode) {
    pushExecutor.submit(new com.squareup.okhttp.internal.NamedRunnable("OkHttp %s Push Reset[%s]", hostName, streamId) {
        @java.lang.Override
        public void execute() {
            pushObserver.onReset(streamId, errorCode);
            synchronized(com.squareup.okhttp.internal.spdy.SpdyConnection.this) {
                currentPushRequests.remove(streamId);
            }
        }
    });
}