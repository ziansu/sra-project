private void stopped() {
    com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Change tracker in stopped()", this);
    if ((client) != null) {
        com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Change tracker calling changeTrackerStopped, client: %s", this, client);
        client.changeTrackerStopped(this);
    }else {
        com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Change tracker not calling changeTrackerStopped, client == null", this);
    }
    client = null;
    running = false;
}