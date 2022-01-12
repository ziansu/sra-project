public void map(java.lang.Object key, org.apache.hadoop.io.Text values, Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.StringTokenizer st = new java.util.StringTokenizer(values.toString());
    org.apache.hadoop.io.Text user = new org.apache.hadoop.io.Text(st.nextToken());
    while (st.hasMoreTokens()) {
        context.write(new org.apache.hadoop.io.Text(st.nextToken()), user);
    } 
}