@java.lang.Override
public int getPartition(org.apache.hadoop.io.LongWritable key, org.apache.hadoop.io.LongWritable value, int numberOfPartition) {
    try {
        hbase.query1.HBaseRowKeyPartitioner.fillFirstAndLastID();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    long intervalLength = ((hbase.query1.HBaseRowKeyPartitioner.lastArticleId) - (hbase.query1.HBaseRowKeyPartitioner.firstArticleId)) / numberOfPartition;
    return ((int) ((key.get()) / intervalLength));
}