public model.statistics.BoundedEntityStatistics getDerivedStats() {
    model.statistics.BoundedEntityStatistics derivedStats = this.stats.clone();
    if ((itemManager) != null) {
        itemManager.merge(derivedStats);
    }
    return derivedStats;
}