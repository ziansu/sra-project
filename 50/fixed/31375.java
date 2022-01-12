public void logMetricsAndFinishDelayed(int delayMs) {
    android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            logMetricsAndFinish();
        }
    }, delayMs);
}