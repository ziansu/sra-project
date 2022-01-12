double getFraction(io.opencensus.common.Timestamp now) {
    io.opencensus.common.Duration elapsedTime = now.subtractTimestamp(start);
    com.google.common.base.Preconditions.checkArgument((((now.compareTo(start)) >= 0) && ((elapsedTime.compareLength(duration)) < 0)), "This bucket must be current.");
    return ((double) (io.opencensus.implcore.stats.MutableViewData.toMillis(elapsedTime))) / (io.opencensus.implcore.stats.MutableViewData.toMillis(duration));
}