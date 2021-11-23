public long sizeOfEquivalentValueRange(final long value) {
    int bucketIndex = getBucketIndex(value);
    int subBucketIndex = getSubBucketIndex(value, bucketIndex);
    long distanceToNextValue = 1 << ((unitMagnitude) + (subBucketIndex >= (subBucketCount) ? bucketIndex + 1 : bucketIndex));
    return distanceToNextValue;
}