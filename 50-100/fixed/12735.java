@java.lang.Override
void statisticsImpl(com.trivago.triava.tcache.action.ActionRunner<K, V> actionRunner, java.lang.Object... args) {
    if (java.lang.Boolean.TRUE.equals(args[1])) {
        actionRunner.stats.incrementHitCount();
    }else {
        actionRunner.stats.incrementMissCount();
    }
    super.statisticsImpl(actionRunner);
}