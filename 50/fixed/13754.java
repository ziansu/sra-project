@java.lang.Override
public boolean containsBucket(final B bucket) {
    return bucketsMap.containsKey(bucket.getId());
}