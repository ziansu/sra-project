private static com.teamagam.gimelgimel.app.network.services.message_polling.TaskRunner createThreadTaskRunner(android.os.HandlerThread handlerThread) {
    final android.os.Handler handler = new android.os.Handler(com.teamagam.gimelgimel.app.network.services.message_polling.RepeatedBackoffMessagePolling.getLooper(handlerThread));
    return new com.teamagam.gimelgimel.app.network.services.message_polling.TaskRunner() {
        @java.lang.Override
        public void runNow(java.lang.Runnable task) {
            handler.post(task);
        }

        @java.lang.Override
        public void runInFuture(java.lang.Runnable task, long delayMillis) {
            handler.postDelayed(task, delayMillis);
        }

        @java.lang.Override
        public void stopFutureRuns(java.lang.Runnable task) {
            handler.removeCallbacks(task);
        }
    };
}