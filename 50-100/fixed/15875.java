private static void registerDataSetAsATable() throws java.lang.Exception {
    final org.apache.flink.api.java.ExecutionEnvironment execEnv = org.apache.flink.api.java.ExecutionEnvironment.createLocalEnvironment(com.manning.fia.ch09.MediaBatchTableTransformations.DEFAULT_LOCAL_PARALLELISM);
    final org.apache.flink.api.java.table.BatchTableEnvironment tableEnv = org.apache.flink.api.table.TableEnvironment.getTableEnvironment(execEnv);
    final org.apache.flink.api.java.DataSet<java.lang.String> newsFeeds = execEnv.fromCollection(com.manning.fia.transformations.media.NewsFeedParser.parseData());
    org.apache.flink.api.java.DataSet<org.apache.flink.api.java.tuple.Tuple5<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long>> result = newsFeeds.map(new com.manning.fia.transformations.media.NewsFeedMapper());
    tableEnv.registerDataSet("NewsFeed", result);
}