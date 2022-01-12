@java.lang.Override
public void stop() {
    running.set(false);
    thread.interrupt();
    try {
        thread.join();
    } catch (java.lang.InterruptedException ignored) {
    }
}