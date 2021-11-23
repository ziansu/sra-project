@java.lang.Override
public void wakeupWrites() {
    resumeWrites();
    getWriteThread().execute(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            writeReadyHandler.writeReady();
        }
    });
}