private void writePingLater(final boolean reply, final int payload1, final int payload2, final com.squareup.okhttp.internal.spdy.Ping ping) {
    com.squareup.okhttp.internal.spdy.SpdyConnection.executor.submit(new com.squareup.okhttp.internal.NamedRunnable("OkHttp %s ping %08x%08x", hostName, payload1, payload2) {
        @java.lang.Override
        public void execute() {
            try {
                writePing(reply, payload1, payload2, ping);
            } catch (java.io.IOException ignored) {
            }
        }
    });
}