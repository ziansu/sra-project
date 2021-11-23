public void map(java.lang.Object key, org.apache.hadoop.io.Text value, com.huike.test00.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.util.StringTokenizer itr = new java.util.StringTokenizer(value.toString());
    while (itr.hasMoreTokens()) {
        word.set(itr.nextToken());
        context.write(word, com.huike.test00.WordCount.TokenizerMapper.one);
        com.huike.test00.WordCount.LOG.info((((("[TokenizerMapper][map][context.write][key:" + (word)) + "][value:") + (com.huike.test00.WordCount.TokenizerMapper.one)) + "]"));
    } 
}