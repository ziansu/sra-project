public double calculateCrowdedness(double crowdednessFactor, main.RouteTimetable rtt, main.Stop requestedStop) {
    this.crowdednessFactor = crowdednessFactor;
    java.util.List<java.lang.Double> requestedStopHistoricData = new java.util.ArrayList(main.CapacityDataStore.readHistoricRequestedStopCrowdedness(rtt, requestedStop));
    double averageCrowdedness = 0;
    if (!(requestedStopHistoricData.isEmpty())) {
        for (java.lang.Double dataPoint : requestedStopHistoricData) {
            averageCrowdedness += dataPoint;
        }
        return averageCrowdedness / (requestedStopHistoricData.size());
    }
    return averageCrowdedness * crowdednessFactor;
}