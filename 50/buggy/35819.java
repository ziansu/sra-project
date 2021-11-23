@java.lang.Override
public void start() {
    if (!(server.isRunning())) {
        server.start();
        subscribe();
    }
}