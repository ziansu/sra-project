@java.lang.Override
public org.apache.hive.hcatalog.streaming.mutate.worker.BucketIdAppender newBucketIdAppender(int totalBuckets) {
    return new org.apache.hive.hcatalog.streaming.mutate.worker.BucketIdAppenderImpl(objectInspector, recordIdColumn, totalBuckets, bucketColumns);
}