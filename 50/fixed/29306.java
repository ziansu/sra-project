void updateTimeAvgStats() {
    double timeSinceLastEvent = eventList.timeSinceLastEvent();
    stats.areaNumInQ += (queue.size()) * timeSinceLastEvent;
    if ((serverStatus) == (MM1.ServerStatus.BUSY))
        stats.areaServerStatus += timeSinceLastEvent;
    
}