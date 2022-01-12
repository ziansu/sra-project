public void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text value, mapreduce.userrelateds.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] line = value.toString().split("\t");
    java.lang.String productId = line[1];
    java.lang.String userId = line[2];
    double score = java.lang.Double.parseDouble(line[6]);
    context.write(new org.apache.hadoop.io.Text(productId), new org.apache.hadoop.io.Text(((userId + "|") + score)));
}