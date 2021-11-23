public void run() {
    performAction();
    java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(this::tearDown));
}