public long getTimeBucketAndAdjustBoundaries(long value) {
    if (value < (start)) {
        return -1;
    }
    long diffFromStart = value - (fixedStart);
    long key = diffFromStart / (bucketSpanMillis);
    if (value > (end)) {
        long diffInBuckets = (value - (end)) / (bucketSpanMillis);
        long move = (diffInBuckets + 1) * (bucketSpanMillis);
        start += move;
        end += move;
        triggerPurge = true;
        lowestPurgeableTimeBucket += diffInBuckets;
    }
    return key;
}