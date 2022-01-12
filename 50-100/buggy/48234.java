@java.lang.Override
public synchronized void close() {
    if (!(running))
        return ;
    
    running = false;
    log.warn("start to close DiamondSubscriber");
    localDiamondMiner.stop();
    serverAddressesMiner.stop();
    scheduler.shutdownNow();
    diamondRemoteChecker.shutdown();
    diamondCache.close();
    log.warn("end to close DiamondSubscriber");
}