private void wentOffline() {
    synchronized(connectionSync) {
        isOnline = false;
        for (net.groboclown.idea.p4ic.server.RawServerExecutor exec : clientExec.values()) {
            exec.wentOffline();
        }
        for (java.lang.ref.SoftReference<com.intellij.openapi.project.Project> sp : referenceCounts) {
            com.intellij.openapi.project.Project p = sp.get();
            if ((p != null) && (!(p.isDisposed()))) {
                p.getMessageBus().syncPublisher(P4RemoteConnectionStateListener.TOPIC).onPerforceServerDisconnected(config);
            }
        }
    }
}