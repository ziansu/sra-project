private void taskAcquire(java.util.concurrent.Semaphore lock) {
    try {
        lock.acquire();
    } catch (java.lang.InterruptedException e) {
        java.lang.System.out.println(("Fatal error on task id: %d" + (this.index)));
    }
}