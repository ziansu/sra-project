public void calculatePercentages() {
    long sumDuration = 0L;
    for (org.openmastery.publisher.api.metrics.CapacityDistribution.Entry capacityEntry : capacityDistributionByType.values()) {
        sumDuration += capacityEntry.durationInSeconds;
    }
    for (org.openmastery.publisher.api.metrics.CapacityDistribution.Entry capacityEntry : capacityDistributionByType.values()) {
        if (sumDuration == 0) {
            sumDuration = 1;
        }
        capacityEntry.percentCapacity = (100 * (capacityEntry.durationInSeconds)) / sumDuration;
    }
}