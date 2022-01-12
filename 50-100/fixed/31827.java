@java.lang.Override
public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.Text> values, groupBy.Context context) throws java.io.IOException, java.lang.InterruptedException {
    txt.set((((key + (delim)) + "\t") + (com.google.common.collect.Iterables.size(values))));
    context.write(org.apache.hadoop.io.NullWritable.get(), txt);
}