public void addFinishedTarget(pingClient.Target target) {
    synchronized(finishedTargets) {
        finishedTargets.notify();
        finishedTargets.add(target);
    }
}