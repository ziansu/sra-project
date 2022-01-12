@java.lang.Override
public void map(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.Text val, org.apache.hama.mapreduce.examples.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.StringTokenizer itr = new java.util.StringTokenizer(val.toString());
    while (itr.hasMoreTokens()) {
        java.lang.String token = itr.nextToken();
        org.apache.hama.mapreduce.examples.WordCount.WordCountMapper.word.set(token);
        context.write(org.apache.hama.mapreduce.examples.WordCount.WordCountMapper.word, org.apache.hama.mapreduce.examples.WordCount.WordCountMapper.one);
    } 
}