protected void map(org.apache.hadoop.io.Text key, org.apache.hadoop.io.IntWritable value, com.bigdata.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String[] temp = key.toString().split(Tool.SEPARATOR);
    pageId.set(java.lang.Integer.parseInt(temp[1]));
    wordWordCount.set((((temp[0]) + (Tool.SEPARATOR)) + (value.toString())));
    context.write(pageId, wordWordCount);
}