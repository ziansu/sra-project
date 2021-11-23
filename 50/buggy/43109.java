@java.lang.Override
public void stop() throws java.io.IOException {
    if ((thread) != null) {
        thread.interrupt();
        try {
            thread.join();
            thread = null;
        } catch (java.lang.InterruptedException e) {
        }
    }
}