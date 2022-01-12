protected void waitIfPaused() {
    synchronized(pausedObj) {
        while (paused) {
            com.couchbase.lite.util.Log.v(Log.TAG, ("Waiting: " + (paused)));
            try {
                pausedObj.wait();
            } catch (java.lang.InterruptedException e) {
            }
        } 
    }
}