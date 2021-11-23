public void onClientClosed() {
    if (closed.compareAndSet(false, true)) {
        resume();
    }
}