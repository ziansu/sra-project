void addSessionListener(com.podio.sdk.Request.SessionListener listener, boolean deliverSessionNow) {
    if (listener != null) {
        sessionListeners.add(listener);
        if (deliverSessionNow) {
            listener.onSessionChanged(com.podio.sdk.Session.accessToken(), com.podio.sdk.Session.refreshToken(), com.podio.sdk.Session.expires());
        }
    }
}