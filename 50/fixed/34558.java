@java.lang.Override
public void run() {
    try {
        key.cancel();
    } catch (java.nio.channels.CancelledKeyException e) {
    } finally {
        worker.release();
    }
}