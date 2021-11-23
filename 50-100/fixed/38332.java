public synchronized java.util.ArrayList<data.Metric> getNextMetricSequence() {
    if ((((metricSequenceKeyList.size()) - 1) >= (metricSequenceIndex)) && (threadsRunning)) {
        data.MetricKey mk = metricSequenceKeyList.get(metricSequenceIndex);
        (metricSequenceIndex)++;
        return metricSequenceHash.get(mk);
    }else {
        metricSequenceIndex = 0;
        for (metrics.MetricsUpdaterThread mut : muts) {
            mut.setRunning(false);
        }
        return null;
    }
}