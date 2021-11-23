private void resize() {
    int temp = size;
    size *= 2;
    for (int i = 0; i < temp; i++) {
        ExtensibleHashTable.Bucket b = new ExtensibleHashTable.Bucket(bucketSize);
        buckets.add(b);
    }
    (digits)++;
    for (int i = 0; i < temp; i++) {
        ExtensibleHashTable.Bucket bucket = buckets.get(i);
        bucket.scan();
    }
}