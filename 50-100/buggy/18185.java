private void ping() {
    if (((new java.util.Date().getTime()) - (mLastActionTime)) < (com.facebook.buck.intellij.plugin.ws.BuckClient.PING_PERIOD)) {
        return ;
    }
    if (mConnected) {
        try {
            mWSSocket.sendMessage("ping");
            synchronized(syncObject) {
                mLastActionTime = new java.util.Date().getTime();
            }
        } catch (java.lang.Exception e) {
            com.facebook.buck.intellij.plugin.ws.BuckClient.LOG.error(("Buck plugin, could not send ping because: " + e));
        }
    }
}