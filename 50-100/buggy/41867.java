private void growBuckets() {
    int bucketCount = buckets.size();
    while ((buckets.size()) < (bucketCount * 2))
        buckets.add(new nl.pluizer.Bucket(this));
    
    buckets.subList(0, bucketCount).forEach(Bucket::reset);
}