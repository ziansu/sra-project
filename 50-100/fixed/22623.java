public void put(java.lang.Object obj, java.lang.ref.WeakReference<java.lang.Object> wr) {
    java.lang.Long id = ((long) (obj.hashCode()));
    java.util.List<java.lang.ref.WeakReference<java.lang.Object>> bucket = buckets.get(id);
    if (bucket == null) {
        bucket = new java.util.ArrayList<>();
        buckets.put(id, bucket);
    }
    synchronized(bucket) {
        if (!(bucket.contains(wr))) {
            bucket.add(wr);
        }
    }
}