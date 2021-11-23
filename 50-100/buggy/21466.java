synchronized void handshakeTimeout() {
    cancelTimerTask();
    if ((current) == (STATE_SUCCESS)) {
        com.tc.net.groups.TCGroupManagerImpl.debugInfo(("Handshake successed. Ignore timeout " + (stateInfo(current))));
        return ;
    }
    com.tc.net.groups.TCGroupManagerImpl.logger.warn(("Group member handshake timeout. " + (stateInfo(current))));
    switchToState(STATE_FAILURE);
}