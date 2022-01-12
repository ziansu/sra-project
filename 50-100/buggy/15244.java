private void interruptAndWait() {
    synchronized(workerThread) {
        if ((workerThread) != null) {
            workerThread.interrupt();
            android.widget.Toast.makeText(this, getString(R.string.notify_sync_aborting), Toast.LENGTH_SHORT).show();
            try {
                workerThread.join();
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.RuntimeException(e);
            }
            workerThread = null;
        }
    }
}