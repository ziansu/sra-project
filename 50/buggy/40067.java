public void notifySlaveCount(int numSlaves) {
    if ((numSlavesFinished) >= numSlaves) {
        sol.getSolution().markReady();
        sol.notifySolution();
    }
}