public void stop() throws java.lang.Exception {
    synchronized(this) {
        if (!(startCalled)) {
            return ;
        }
        deActivate();
        if ((registry) != null) {
            registry.close();
        }
        server.stop();
        startCalled = false;
    }
}