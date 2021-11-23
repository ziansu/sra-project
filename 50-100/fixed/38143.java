@java.lang.Override
public synchronized void close() {
    if (!(running))
        return ;
    
    running = false;
    log.warn("start to close DiamondSubscriber");
    localDiamondMiner.stop();
    if ((serverAddressesMiner) != null)
        serverAddressesMiner.stop();
    
    scheduler.shutdownNow();
    if ((diamondRemoteChecker) != null)
        diamondRemoteChecker.shutdown();
    
    diamondCache.close();
    log.warn("end to close DiamondSubscriber");
}