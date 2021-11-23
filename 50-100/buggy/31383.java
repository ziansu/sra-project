private void openTaskCheckStatus() {
    scheduledExecutorService.scheduleWithFixedDelay(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                socket.sendUrgentData(255);
            } catch (java.io.IOException e) {
                transportDisconnected();
            }
        }
    }, 0, 50, java.util.concurrent.TimeUnit.SECONDS);
}