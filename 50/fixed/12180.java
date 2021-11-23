@java.lang.Override
public void run() {
    synchronized(isRunning) {
        if (isRunning) {
            log.info("Shutting down UPnP service...");
            shutdownRegistry();
            shutdownConfiguration();
            shutdownRouter();
            log.info("UPnP service shutdown completed");
            isRunning = false;
        }
    }
}