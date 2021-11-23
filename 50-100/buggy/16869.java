public synchronized void start() throws java.io.IOException, java.security.NoSuchAlgorithmException {
    new java.lang.Thread(handler).start();
    startRun();
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            while (true) {
                kickoffUpdateMaps();
                try {
                    java.lang.Thread.sleep(10000);
                } catch (java.lang.InterruptedException e) {
                }
            } 
        }
    }).start();
    master.WebSocketChannelManager.startHeartbeatManager();
    initialized = true;
}