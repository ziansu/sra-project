public void startKeepAliveSender() {
    io.callstats.sdk.CallStatsBridgeKeepAliveManager.scheduler.scheduleAtFixedRate(new java.lang.Runnable() {
        public void run() {
            sendKeepAliveBridgeMessage(appId, bridgeId, token, httpClient);
        }
    }, 0, 1000, java.util.concurrent.TimeUnit.MILLISECONDS);
}