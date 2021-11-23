private boolean isConnectionHealthy(long elapsed) {
    if (elapsed >= (heartBeatInterval)) {
        return connection.isHeartBeating();
    }
    return true;
}