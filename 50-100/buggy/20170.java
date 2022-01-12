public double calculateCrowdedness(double crowdednessFactor, main.RouteTimetable rtt, main.Stop requestedStop) {
    this.crowdednessFactor = crowdednessFactor;
    main.CapacityDataStore requestedStopDataReader = new main.CapacityDataStore();
    java.util.List<java.lang.Double> requestedStopHistoricData = new java.util.ArrayList(requestedStopDataReader.readHistoricRequestedStopCrowdedness(rtt, requestedStop));
    double averageCrowdedness = 0;
    if (!(requestedStopHistoricData.isEmpty())) {
        for (java.lang.Double dataPoint : requestedStopHistoricData) {
            averageCrowdedness += dataPoint;
        }
        return averageCrowdedness / (requestedStopHistoricData.size());
    }
    return averageCrowdedness * crowdednessFactor;
}