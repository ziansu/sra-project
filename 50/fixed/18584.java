@java.lang.Override
protected void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, org.apache.mahout.df.mapreduce.partial.Context context) throws java.io.IOException, java.lang.InterruptedException {
    instances.add(converter.convert(((id)++), value.toString()));
}