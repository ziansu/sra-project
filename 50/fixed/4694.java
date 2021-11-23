private void updateDirectories() {
    registerDirWatchesRecursively();
    unregisterStaleDirWatches();
}