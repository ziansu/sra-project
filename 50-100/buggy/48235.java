private void waitIfPaused() {
    while (paused) {
        com.couchbase.lite.util.Log.v(Log.TAG, ("Waiting: " + (paused)));
        synchronized(pausedObj) {
            try {
                pausedObj.wait();
            } catch (java.lang.InterruptedException e) {
            }
        }
    } 
}