private void growBuckets() {
    int bucketCount = buckets.size();
    while ((buckets.size()) < (bucketCount * 2))
        buckets.add(new nl.pluizer.Bucket(this));
    
    for (int i = 0; i < bucketCount; i++) {
        buckets.get(i).reset();
    }
}