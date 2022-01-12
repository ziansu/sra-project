private boolean synchronizeFounders() {
    mLastSyncTime = java.lang.System.currentTimeMillis();
    int maxVersion = maxFounderVersion();
    int serverMaxVersion = 0;
    serverMaxVersion = syncDeletedFounders(serverMaxVersion);
    serverMaxVersion = syncNewFounders(serverMaxVersion);
    serverMaxVersion = syncDirtyFounders(serverMaxVersion);
    return syncServerFounderUpdates(maxVersion, serverMaxVersion);
}