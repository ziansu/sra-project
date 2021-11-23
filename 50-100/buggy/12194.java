@java.lang.Override
public void reduce(org.apache.hadoop.io.Text word, java.lang.Iterable<org.apache.hadoop.io.IntWritable> counts, com.moz.commoncrawl.Context context) throws java.io.IOException, java.lang.InterruptedException {
    int sum = 0;
    for (org.apache.hadoop.io.IntWritable count : counts) {
        sum += count.get();
    }
    if (((threshold) != (-1)) && (sum > (threshold)))
        context.write(word, new org.apache.hadoop.io.IntWritable(sum));
    
}