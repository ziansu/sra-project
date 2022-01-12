public void resetTimer() {
    java.util.TimerTask timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            flushEventBatch(eventBatch);
        }
    };
    if ((timer) != null) {
        timer.cancel();
        timer.purge();
    }
    timer = new java.util.Timer();
    timer.schedule(timerTask, 10000);
}