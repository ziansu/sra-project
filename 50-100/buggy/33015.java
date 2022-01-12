private void resize() {
    for (int i = 0; i < (size); i++) {
        ExtensibleHashTable.Bucket b = new ExtensibleHashTable.Bucket(bucketSize);
        buckets.add(b);
    }
    (digits)++;
    for (int i = 0; i < (size); i++) {
        ExtensibleHashTable.Bucket bucket = buckets.get(i);
        bucket.scan();
    }
    size *= 2;
}