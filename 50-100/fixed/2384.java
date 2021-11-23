public static com.hazelcast.simulator.visualiser.data.SimpleHistogramDataSetContainer calculateSingleProbeDataSet(com.hazelcast.simulator.probes.probes.Result probeData, int accuracy, double scalingPercentile) {
    if (probeData instanceof com.hazelcast.simulator.probes.probes.impl.HdrLatencyDistributionResult) {
        return com.hazelcast.simulator.visualiser.utils.DataSetUtils.calcSingleProbeDataSet(((com.hazelcast.simulator.probes.probes.impl.HdrLatencyDistributionResult) (probeData)), accuracy, scalingPercentile);
    }
    if (probeData instanceof com.hazelcast.simulator.probes.probes.impl.LatencyDistributionResult) {
        return com.hazelcast.simulator.visualiser.utils.DataSetUtils.calcSingleProbeDataSet(((com.hazelcast.simulator.probes.probes.impl.LatencyDistributionResult) (probeData)), accuracy, scalingPercentile);
    }
    return null;
}