@java.lang.Override
public void reduce(org.apache.hadoop.io.Text date, java.util.Iterator<org.apache.hadoop.io.IntWritable> values, org.apache.hadoop.mapred.OutputCollector<org.apache.hadoop.io.Text, org.apache.hadoop.io.IntWritable> output, org.apache.hadoop.mapred.Reporter reporter) throws java.io.IOException {
    int sum = 0;
    while (values.hasNext()) {
        org.apache.hadoop.io.IntWritable intWritable = ((org.apache.hadoop.io.IntWritable) (values.next()));
        java.lang.System.out.println(intWritable);
        sum += intWritable.get();
    } 
    output.collect(date, new org.apache.hadoop.io.IntWritable(sum));
}