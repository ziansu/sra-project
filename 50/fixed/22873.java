protected void cleanup(lab1code.Context context) throws java.io.IOException, java.lang.InterruptedException {
    for (org.apache.hadoop.io.Text t : repToRecordMap.values()) {
        context.write(org.apache.hadoop.io.NullWritable.get(), new org.apache.hadoop.io.Text(t));
    }
}