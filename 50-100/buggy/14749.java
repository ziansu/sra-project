public ChartData.DataPoint getClosestDataPointToTimestampBelow(long timestamp, long belowTimestamp) {
    int closestIndex = mChartData.getClosestIndexToTimestamp(timestamp);
    com.google.android.apps.forscience.whistlepunk.scalarchart.ChartData.DataPoint closestPoint = mChartData.getPoints().get(closestIndex);
    if ((closestPoint.getX()) <= belowTimestamp) {
        return closestPoint;
    }
    if ((closestIndex - 1) >= 0) {
        return mChartData.getPoints().get((closestIndex - 1));
    }
    return null;
}