@java.lang.Override
public void reduce(org.apache.hadoop.io.IntWritable key, java.lang.Iterable<org.apache.hadoop.io.IntWritable> values, com.hadoop.coursera.Context context) throws java.io.IOException, java.lang.InterruptedException {
    int sum = 0;
    for (org.apache.hadoop.io.IntWritable val : values) {
        sum += val.get();
    }
    if (sum == 1)
        context.write(key, null);
    
}