public void map(java.lang.Object key, org.apache.hadoop.hw.Text value, org.apache.hadoop.hw.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.StringTokenizer itr = new java.util.StringTokenizer(value.toString());
    while (itr.hasMoreTokens()) {
        java.lang.String[] tuple = itr.nextToken().split(",");
        id.set(java.lang.Integer.parseInt(tuple[1]));
        pair = new org.apache.hadoop.hw.TransactionSummary.PairWritable(1, java.lang.Double.parseDouble(tuple[2]));
        context.write(id, pair);
    } 
}