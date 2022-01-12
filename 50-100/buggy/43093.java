@java.lang.Override
public void reduce(org.apache.hadoop.io.IntWritable key, java.lang.Iterable<org.apache.hadoop.io.IntWritable> values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    int sum = 0;
    for (org.apache.hadoop.io.IntWritable val : values) {
        sum += val.get();
    }
    countToWordMap.add(sum, key.get());
}