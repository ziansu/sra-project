public void shutdown() {
    running = false;
    elkAlarmThread.interrupt();
    elkAlarmThread = null;
    if ((socket) != null) {
        try {
            socket.close();
            socket = null;
        } catch (java.io.IOException e) {
            logger.error("Closing the socket", config.ipAddress, config.port, e);
        }
    }
}