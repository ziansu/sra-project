public void stopTracking(boolean propagate) {
    this.tracker.stopTracking();
    if ((this.flushExecutor) != null) {
        this.flushExecutor.shutdown();
        this.flushExecutor = null;
    }
    this.trackedProjectManager.stopTracking();
    this.isTracking = false;
    if (propagate) {
        setChanged();
        notifyObservers();
    }
}