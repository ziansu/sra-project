@java.lang.Override
public void run() {
    try {
        _announceService.stop(false);
        _peerManager.disconnectAllConcurrently();
        _peerManager.stop();
    } catch (java.lang.InterruptedException e) {
    }
    if (isRemoved) {
        _peerManager.cleanup();
    }
    _connectionService.unregister(this);
}