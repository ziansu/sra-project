@java.lang.Override
public double getCost() {
    double cost = 0.0;
    for (org.apache.lens.cube.metadata.TimeRange timeRange : cubeql.getTimeRanges()) {
        for (java.util.Map.Entry<org.apache.lens.cube.parse.Candidate, org.apache.lens.cube.metadata.TimeRange> entry : getTimeRangeSplit(timeRange).entrySet()) {
            cost += ((entry.getValue().milliseconds()) / (timeRange.milliseconds())) * (entry.getKey().getCost());
        }
    }
    return cost;
}