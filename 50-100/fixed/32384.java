private void incrementCount(org.apache.hadoop.io.MapWritable map, org.apache.hadoop.io.Text key) {
    org.apache.hadoop.io.IntWritable count = ((org.apache.hadoop.io.IntWritable) (map.getOrDefault(key, ZERO)));
    map.put(key, new org.apache.hadoop.io.IntWritable(((count.get()) + 1)));
}