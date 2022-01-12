public void stop() throws java.lang.Exception {
    synchronized(this) {
        if (!(startCalled)) {
            return ;
        }
        startCalled = false;
        deActivate();
        if ((registry) != null) {
            registry.close();
        }
    }
    server.stop();
}