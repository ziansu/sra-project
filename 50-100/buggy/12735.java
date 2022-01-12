@java.lang.Override
void statisticsImpl(com.trivago.triava.tcache.action.ActionRunner<K, V> actionRunner, java.lang.Object... args) {
    if ((args[1]) == (java.lang.Boolean.TRUE)) {
        actionRunner.stats.incrementHitCount();
    }else {
        actionRunner.stats.incrementMissCount();
    }
    super.statisticsImpl(actionRunner);
}