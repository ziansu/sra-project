public void shutdown() {
    running = false;
    elkAlarmThread.interrupt();
    elkAlarmThread = null;
    try {
        socket.close();
    } catch (java.io.IOException e) {
        logger.error("Closing the socket", config.ipAddress, config.port, e);
    }
}