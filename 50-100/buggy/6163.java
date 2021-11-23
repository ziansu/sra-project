@java.lang.Override
public int getPartition(hbase.query3.ArticleIDTimestampWritable key, org.apache.hadoop.io.LongWritable value, int numOfPartitions) {
    try {
        hbase.query3.HBaseCompositeKeyPartitioner.fillFirstAndLastID();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    long intervalLength = ((hbase.query3.HBaseCompositeKeyPartitioner.lastArticleId) - (hbase.query3.HBaseCompositeKeyPartitioner.firstArticleId)) / numOfPartitions;
    return ((int) ((key.getArticleId()) / intervalLength));
}