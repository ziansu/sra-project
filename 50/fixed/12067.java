public synchronized void cancel() {
    if ((curCoordinator) != null) {
        curCoordinator.cancel();
    }
}