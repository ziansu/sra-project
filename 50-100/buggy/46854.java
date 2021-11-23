private void redistributeData() {
    java.util.List<java.lang.Object> values = java.util.Arrays.asList(((java.lang.Object[]) (data.values().toArray())));
    java.util.Collections.shuffle(values);
    tim.parallel.Bucket bucket;
    for (java.lang.Object obj : values) {
        bucket = ((tim.parallel.Bucket) (obj));
        buckets[((bucket.getKey()) - 1)].union(bucket);
    }
}