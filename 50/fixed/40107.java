private void startThread() {
    if (started.compareAndSet(false, true)) {
        java.lang.Thread t = threadFactory.newThread(taskRunner);
        thread = t;
        t.start();
    }
}