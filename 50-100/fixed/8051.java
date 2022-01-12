public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.DoubleWritable> values, cloudCompu.PageRankMr.Context context) throws java.io.IOException, java.lang.InterruptedException {
    double tmppr = 0.0;
    for (org.apache.hadoop.io.DoubleWritable val : values) {
        tmppr += val.get();
    }
    title.set("Sum");
    pr.set(java.lang.String.valueOf(tmppr));
    context.write(title, pr);
}