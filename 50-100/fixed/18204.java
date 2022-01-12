public void start() {
    synchronized(startStopLock) {
        if (isInProgress()) {
            return ;
        }
        if (((strategy) != null) && ((strategy.getTypeStrategy()) == (PacmanStrategy.Type.AI))) {
            startAIStrategy();
        }
        startNPCs();
        inProgress = true;
        updateObservers();
    }
}