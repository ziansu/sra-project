@java.lang.Override
public void run() {
    try {
        collectStatsImpl(c, clientHandle, selector);
    } catch (java.lang.Throwable e) {
        org.voltdb.StatsAgent.hostLog.warn("Exception while attempting to collect stats", e);
    }
}