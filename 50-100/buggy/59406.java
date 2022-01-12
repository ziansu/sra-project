public void schedulePingTimeout() {
    cancelPingTimeout();
    com.corundumstudio.socketio.scheduler.SchedulerKey key = new com.corundumstudio.socketio.scheduler.SchedulerKey(com.corundumstudio.socketio.scheduler.SchedulerKey.Type.PING_TIMEOUT, sessionId);
    disconnectScheduler.schedule(key, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            com.corundumstudio.socketio.handler.ClientHead client = clientsBox.get(sessionId);
            if (client != null) {
                client.onChannelDisconnect();
                log.debug("{} removed due to ping timeout", sessionId);
            }
        }
    }, ((configuration.getPingTimeout()) + (configuration.getPingInterval())), java.util.concurrent.TimeUnit.MILLISECONDS);
}