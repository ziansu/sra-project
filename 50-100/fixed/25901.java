@java.lang.Override
public int run(java.lang.String[] args) throws java.lang.Exception {
    org.apache.hadoop.mapreduce.Job job = setup(org.apache.hadoop.mapreduce.lib.input.TextInputFormat.class, org.apache.hadoop.mapreduce.lib.output.NullOutputFormat.class, org.apache.hadoop.io.LongWritable.class, org.apache.hadoop.io.LongWritable.class, org.apache.hadoop.io.NullWritable.class, org.apache.hadoop.io.NullWritable.class, org.hedera.mapreduce.MaxTimestamp.MyMapper.class, org.hedera.mapreduce.MaxTimestamp.MyReducer.class, org.hedera.mapreduce.MaxTimestamp.MyCombiner.class, args);
    job.waitForCompletion(true);
    return 0;
}