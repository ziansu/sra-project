private void togglePause() {
    synchronized(this) {
        if ((pausedTimestamp) == 0) {
            pausedTimestamp = java.lang.System.currentTimeMillis();
        }else {
            pausedOffset += (java.lang.System.currentTimeMillis()) - (pausedTimestamp);
            pausedTimestamp = 0;
        }
        notifyAll();
    }
}