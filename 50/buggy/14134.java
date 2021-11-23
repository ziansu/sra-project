public void newShutdown() {
    stop();
    destroy();
    java.lang.System.exit(0);
}