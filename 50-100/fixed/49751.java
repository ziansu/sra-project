@java.lang.Override
public void run() {
    try {
        _announceService.stop(true);
        _peerManager.disconnectAllConcurrently();
        _peerManager.stop();
        if (isRemoved) {
            _peerManager.cleanup();
        }
    } catch (java.lang.InterruptedException e) {
    }
    if (isRemoved) {
        _peerManager.cleanup();
    }
    _connectionService.unregister(this);
}