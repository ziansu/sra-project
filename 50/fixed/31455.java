public void forceCancelDisconnecting() {
    synchronized(this) {
        removed = false;
        if (!(disconnecting))
            return ;
        
        disconnecting = false;
    }
    setPeerNodeStatus(java.lang.System.currentTimeMillis(), true, false);
}