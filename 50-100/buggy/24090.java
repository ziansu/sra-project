@java.lang.Override
protected void map(java.lang.Object key, org.apache.hadoop.io.Text value, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] pr = value.toString().trim().split("\t");
    context.write(new org.apache.hadoop.io.Text(pr[0]), new org.apache.hadoop.io.Text(pr[1]));
}