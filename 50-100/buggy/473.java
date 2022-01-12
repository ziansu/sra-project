public void merge(com.jflop.server.runtime.data.processed.MethodFlowStatistics stat) {
    this.throughputPerSec += stat.throughputPerSec;
    this.minTime = java.lang.Math.min(this.minTime, stat.minTime);
    this.maxTime = java.lang.Math.max(this.maxTime, stat.maxTime);
    this.averageTime = ((this.averageTime) + (stat.averageTime)) / 2;
}