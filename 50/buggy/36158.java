public void onClientClosed() {
    if (closed.compareAndSet(false, false)) {
        resume();
    }
}