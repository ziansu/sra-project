public org.apache.hadoop.mapreduce.RecordReader<spatial.ShapeKey, org.apache.hadoop.io.BytesWritable> createRecordReader(org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context) throws java.io.IOException, java.lang.InterruptedException {
    return new spatial.ShapeFileReader();
}