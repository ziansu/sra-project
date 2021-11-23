public void start() {
    synchronized(startStopLock) {
        if (isInProgress()) {
            return ;
        }
        startNPCs();
        inProgress = true;
        if (((strategy) != null) && ((strategy.getTypeStrategy()) == (PacmanStrategy.Type.AI))) {
            startAIStrategy();
        }
        updateObservers();
    }
}