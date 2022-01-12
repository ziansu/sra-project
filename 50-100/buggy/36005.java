private void success() {
    com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("success");
    synchronized(this) {
        com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("success sync");
        if ((!(done)) && ((complete.incrementAndGet()) == (expected))) {
            done = true;
            if ((timeoutFuture) != null) {
                timeoutFuture.cancel(true);
            }
            setSuccess(null);
        }
    }
    com.barchart.netty.server.util.TimeoutPromiseGroup.log.debug("success out");
}