@java.lang.Override
public double forecast(final teead.timeseries.EquidistantTimeSeries timeSeries) {
    double weightedSum = 0;
    double totalWeights = 0;
    int position = 1;
    for (teead.timeseries.TimeSeriesPoint point : timeSeries) {
        final double weight = getWeight(position);
        totalWeights += weight;
        weightedSum += (point.getValue()) * weight;
        position++;
    }
    return weightedSum / totalWeights;
}