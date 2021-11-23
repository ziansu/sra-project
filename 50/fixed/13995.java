@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(timeout);
        synchronized(this) {
            this.pthread.interrupt();
        }
    } catch (java.lang.InterruptedException e) {
    }
}