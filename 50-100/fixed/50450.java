private void wakeMe(long checkPause) {
    java.util.Timer t = new java.util.Timer(false);
    co.geomati.tpg.ThermometerMonitor.logger.debug((("Waiting " + checkPause) + " ms until the next wake up"));
    t.schedule(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            monitor();
        }
    }, checkPause);
}