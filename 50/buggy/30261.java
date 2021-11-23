@java.lang.Override
public void run() {
    context.terminate();
    try {
        p.stop();
    } catch (java.util.concurrent.TimeoutException e) {
        java.lang.System.err.println("Timed out trying to shutdown maxwell parser thread.");
    }
}