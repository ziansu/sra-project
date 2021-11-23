public void running(final com.gemstone.gemfire.distributed.internal.InternalDistributedSystem system) {
    com.gemstone.gemfire.internal.cache.CacheServerLauncher.Status stat = this.status;
    if (stat == null) {
        stat = this.status = com.gemstone.gemfire.internal.cache.CacheServerLauncher.createStatus(this.baseName, com.gemstone.gemfire.internal.cache.CacheServerLauncher.RUNNING, getProcessId());
    }else {
        if ((stat.state) == (com.gemstone.gemfire.internal.cache.CacheServerLauncher.WAITING)) {
            stat.dsMsg = null;
        }else {
            stat.state = com.gemstone.gemfire.internal.cache.CacheServerLauncher.RUNNING;
        }
    }
    setRunningStatus(stat, system);
}