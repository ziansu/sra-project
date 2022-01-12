public final void stopThread() {
    stopped = true;
    synchronized(queue) {
        queue.notify();
    }
}