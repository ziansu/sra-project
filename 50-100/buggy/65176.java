public void stop() {
    com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Changed tracker asked to stop", this);
    try {
        running = false;
        try {
            if ((thread) != null) {
                thread.interrupt();
            }
        } catch (java.lang.Exception e) {
            com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Exception interrupting thread: %s", this);
        }
        if ((request) != null) {
            com.couchbase.lite.util.Log.d(Log.TAG_CHANGE_TRACKER, "%s: Changed tracker aborting request: %s", this, request);
            request.abort();
        }
    } finally {
        stopped();
    }
}