protected final long getLastAnomalyTime(java.lang.String operation) {
    edu.ucsb.cs.roots.anomaly.AnomalyDetector.WaitPeriod waitPeriod = waitPeriods.get(operation);
    if (waitPeriod != null) {
        return waitPeriod.from;
    }
    return -1L;
}