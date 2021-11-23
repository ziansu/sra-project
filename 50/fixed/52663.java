private boolean isReachable(java.lang.String ipAddress) {
    try {
        synchronized(client) {
            client.Connect();
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}