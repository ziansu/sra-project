public void setManualPresence(boolean present, long expirationTime) {
    _manualExpirationDate = new java.util.Date(((new java.util.Date().getTime()) + expirationTime));
    pauseDetection();
    _watchdogHandler.postDelayed(_onManualPresenceExpired, expirationTime);
    updatePresence(present, "Manual", "");
}