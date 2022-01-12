@java.lang.Override
public void run() {
    try {
        server.stop();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    server.destroy();
}