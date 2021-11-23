private boolean isConnectionHealthy(long elapsed) {
    if (elapsed >= (heartBeatInterval)) {
        return (connection.isAlive()) && (connection.isHeartBeating());
    }
    return true;
}