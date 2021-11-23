public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.Text> values, managers.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] tokens;
    for (org.apache.hadoop.io.Text val : values) {
        tokens = val.toString().split("\\t");
        maxX.set(val);
        context.write(new org.apache.hadoop.io.Text(), maxX);
    }
}