@java.lang.Override
protected void reduce(org.apache.hadoop.io.Text key, java.lang.Iterable<org.apache.hadoop.io.IntWritable> values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    double sum = 0;
    double totalReviews = 0;
    for (org.apache.hadoop.io.IntWritable val : values) {
        sum += val.get();
        ++totalReviews;
    }
    double avgRating = sum / totalReviews;
    context.write(key, new org.apache.hadoop.io.DoubleWritable(avgRating));
}