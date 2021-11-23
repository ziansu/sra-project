public void reduce(Text key, java.util.Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws java.io.IOException {
    int sum = 0;
    while (values.hasNext()) {
        sum += values.next().get();
    } 
    output.collect(key, new IntWritable(sum));
}