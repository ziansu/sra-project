@java.lang.Override
public void run() {
    long start = java.lang.System.currentTimeMillis();
    if (event.isRunning()) {
        event.execute();
    }
    long elapsed = (java.lang.System.currentTimeMillis()) - start;
    long remaining = (event.getDelay()) - elapsed;
    if (remaining <= 0) {
        remaining = 0;
    }
    submit(event, remaining);
}