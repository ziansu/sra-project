private void stop_clock_count(java.util.Timer timer) {
    timer.cancel();
    clockCount.clear();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mClockCount.setText(clockCount.getTime());
        }
    });
}