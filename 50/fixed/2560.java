@java.lang.Override
public void run() {
    try {
        java.lang.Thread.sleep(1);
        server.terminate(clientId);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}