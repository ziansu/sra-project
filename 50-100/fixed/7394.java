private void fail(final java.lang.Throwable t) {
    synchronized(this) {
        if (!(done)) {
            done = true;
            if ((timeoutFuture) != null) {
                timeoutFuture.cancel(true);
            }
            setFailure(t);
        }
    }
}