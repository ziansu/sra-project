public void reset() {
    long time = java.lang.System.currentTimeMillis();
    this.internalEventID = 0;
    this.subscriptionsMatched = net.openhft.koloboke.collect.set.hash.HashIntSets.newMutableSet();
    statistics.Statistics.filterResetTime[this.filterID] += (java.lang.System.currentTimeMillis()) - time;
}