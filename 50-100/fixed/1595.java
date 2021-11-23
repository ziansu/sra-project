public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    int result = super.onStartCommand(intent, flags, startId);
    android.widget.Toast.makeText(this, getString(R.string.notify_sync_start), Toast.LENGTH_SHORT).show();
    workerThread = new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onHandleIntent(intent);
        }
    });
    workerThread.start();
    return result;
}