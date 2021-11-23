public void run() {
    performAction();
    synchronized(this) {
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(this::tearDown));
    }
}