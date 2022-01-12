private void adjustRate() {
    if ((timerTask) != null) {
        timerTask.cancel();
    }
    timerTask = new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            executor.submit(org.onosproject.net.intent.impl.IntentCleanup.this);
        }
    };
    periodMs = (period) * 1000;
    timer.scheduleAtFixedRate(timerTask, periodMs, periodMs);
}