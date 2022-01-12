private int getReconnectionDelay(int attempt) {
    if ((attempt < 1) || (attempt > (chatty.TwitchConnection.RECONNECTION_DELAY.length))) {
        return getMaxReconnectionDelay();
    }
    return chatty.TwitchConnection.RECONNECTION_DELAY[(attempt - 1)];
}