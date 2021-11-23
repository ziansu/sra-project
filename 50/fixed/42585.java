private void startNewSession(long timestamp) {
    if (trackingSessionEvents) {
        sendSessionEvent(com.amplitude.api.AmplitudeClient.END_SESSION_EVENT);
    }
    setSessionId(timestamp);
    refreshSessionTime(timestamp);
    if (trackingSessionEvents) {
        sendSessionEvent(com.amplitude.api.AmplitudeClient.START_SESSION_EVENT);
    }
}