private void fail(final java.lang.Throwable t) {
    com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("fail");
    synchronized(this) {
        com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("fail sync");
        if (!(done)) {
            done = true;
            if ((timeoutFuture) != null) {
                timeoutFuture.cancel(true);
            }
            setFailure(t);
        }
    }
    com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("fail out");
}