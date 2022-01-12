public void run() {
    uk.ac.imperial.lsds.seep.runtimeengine.OutOfOrderBufferedBarrier.logger.warn((("Nonblocking join " + ts) + " timed out."));
    synchronized(this) {
        if ((timeoutTasks.remove(ts)) != null) {
            addReady(ts);
        }
    }
}