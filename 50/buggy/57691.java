@java.lang.Override
public final void run() {
    isRunning = true;
    if (waitNextWatchingRequested) {
        waitNextWatchingDone = true;
    }
    rootDirectoryWatcher.watch();
    if (waitNextWatchingRequested) {
        waitNextWatchingRequested = false;
    }
    isRunning = false;
}