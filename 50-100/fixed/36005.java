private void success() {
    synchronized(this) {
        if ((!(done)) && ((complete.incrementAndGet()) == (expected))) {
            done = true;
            if ((timeoutFuture) != null) {
                timeoutFuture.cancel(true);
            }
            setSuccess(null);
        }
    }
}