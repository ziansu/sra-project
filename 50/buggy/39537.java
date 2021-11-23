protected boolean checkStatusForWait(com.gemstone.gemfire.internal.cache.CacheServerLauncher.Status status) {
    return (((status.state) == (com.gemstone.gemfire.internal.cache.CacheServerLauncher.STARTING)) || ((status.state) == (com.gemstone.gemfire.internal.cache.CacheServerLauncher.WAITING))) || ((status.state) == (com.gemstone.gemfire.internal.cache.CacheServerLauncher.STANDBY));
}