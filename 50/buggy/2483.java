@java.lang.Override
public void start() throws java.io.IOException {
    running.set(true);
    logTracker.start();
    if ((consumers) != null) {
        consumers.consume();
    }
}