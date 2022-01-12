@java.lang.Override
public void run() {
    if ((Config.CONFIG.getDistribution()) != (fredboat.util.DistributionEnum.MAIN)) {
        return ;
    }
    try {
        while (true) {
            synchronized(this) {
                sendStats();
                java.lang.Thread.sleep(((30 * 60) * 1000));
            }
        } 
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}