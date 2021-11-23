public void map(java.lang.Object key, org.apache.hadoop.io.Text values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.StringTokenizer st = new java.util.StringTokenizer(values.toString());
    org.apache.hadoop.io.IntWritable user = new org.apache.hadoop.io.IntWritable(java.lang.Integer.parseInt(st.nextToken()));
    while (st.hasMoreTokens()) {
        context.write(new org.apache.hadoop.io.IntWritable(java.lang.Integer.parseInt(st.nextToken())), user);
    } 
}