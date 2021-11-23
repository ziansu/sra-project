public void reset() {
    this.subscriptionsMatched = net.openhft.koloboke.collect.set.hash.HashIntSets.newMutableSet();
    this.merge = false;
}