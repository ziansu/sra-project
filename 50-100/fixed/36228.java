@java.lang.Override
protected void reduce(org.apache.hadoop.io.IntWritable key, java.lang.Iterable<org.apache.hadoop.io.IntWritable> values, com.pravritti.Context context) throws java.io.IOException, java.lang.InterruptedException {
    int sum = 0;
    for (org.apache.hadoop.io.IntWritable value : values) {
        sum = sum + (value.get());
    }
    context.write(key, new org.apache.hadoop.io.IntWritable(sum));
}