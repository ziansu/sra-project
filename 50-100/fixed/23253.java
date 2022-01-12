public void reduce(Text key, java.util.Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws java.io.IOException {
    int count = 0;
    while (values.hasNext()) {
        values.next();
        count++;
    } 
    output.collect(key, new IntWritable(count));
}