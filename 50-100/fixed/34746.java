public void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.Text> values, org.apache.hadoop.mapreduce.Reducer.Context context) throws java.io.IOException, java.lang.InterruptedException {
    double tmppr = 0.0;
    for (org.apache.hadoop.io.Text t : values) {
        title.set(key);
        err.set(t);
        context.write(title, err);
    }
}