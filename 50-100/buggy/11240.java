private void synchronizeFounders() {
    mLastSyncTime = java.lang.System.currentTimeMillis();
    int maxVersion = maxFounderVersion();
    int serverMaxVersion = 0;
    serverMaxVersion = syncDeletedFounders(serverMaxVersion);
    serverMaxVersion = syncNewFounders(serverMaxVersion);
    serverMaxVersion = syncDirtyFounders(serverMaxVersion);
    syncServerFounderUpdates(maxVersion, serverMaxVersion);
}