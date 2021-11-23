public void init() {
    org.kiteq.commons.monitor.KiteQMonitor.SCHEDULED_THREAD_POOL_EXECUTOR.scheduleAtFixedRate(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                org.kiteq.commons.monitor.KiteQMonitor.LOGGER.info(org.kiteq.commons.monitor.KiteQMonitor.this.formatOutput());
            } catch (java.lang.Exception e) {
                org.kiteq.commons.monitor.KiteQMonitor.LOGGER.error("monitorUpload.formatOutput|FAIL", e);
            }
        }
    }, 10, 1, java.util.concurrent.TimeUnit.SECONDS);
}