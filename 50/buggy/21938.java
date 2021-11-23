private int getReconnectionDelay(int attempt) {
    if ((attempt < 0) || (attempt >= (chatty.TwitchConnection.RECONNECTION_DELAY.length))) {
        return getMaxReconnectionDelay();
    }
    return chatty.TwitchConnection.RECONNECTION_DELAY[attempt];
}