@java.lang.Override
protected void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, org.apache.hadoop.mapreduce.Mapper.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] split = value.toString().split("\t");
    k.set(split[0]);
    v.set(java.lang.Integer.parseInt(split[((split.length) - 1)]));
    context.write(k, v);
}