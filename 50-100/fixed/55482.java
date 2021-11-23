@java.lang.Override
public void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String line = value.toString();
    java.lang.String[] fields = line.split("\t");
    java.lang.String twitterId = fields[0];
    java.lang.String tweet = fields[1];
    context.write(new org.apache.hadoop.io.Text(twitterId), new org.apache.hadoop.io.Text(tweet));
}