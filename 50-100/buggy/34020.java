private void doBrightness(int minutes, final int _screenStartTime, final int _screenBrightness) {
    java.lang.Runnable screenTimerRunnable = new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            setBrightness(_screenStartTime, _screenBrightness);
        }
    };
    alarmHandler.postDelayed(screenTimerRunnable, java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes));
}