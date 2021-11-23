@java.lang.Override
public java.util.List<java.lang.Integer> emit(java.lang.String streamId, java.util.List<java.lang.Object> tuple, java.lang.Object messageId) {
    org.apache.storm.hdfs.spout.HdfsSpout.MessageId id = ((org.apache.storm.hdfs.spout.HdfsSpout.MessageId) (messageId));
    lines.add(tuple.toString());
    items.add(org.apache.storm.hdfs.spout.HdfsSpout.Pair.of(((org.apache.storm.hdfs.spout.HdfsSpout.MessageId) (messageId)), tuple));
    return null;
}