@java.lang.Override
public int compare(org.apache.hadoop.hbase.util.Pair<byte[], org.apache.hadoop.hbase.util.Pair<byte[], byte[]>> o1, org.apache.hadoop.hbase.util.Pair<byte[], org.apache.hadoop.hbase.util.Pair<byte[], byte[]>> o2) {
    return isReversed() ? org.apache.hadoop.hbase.util.Bytes.compareTo(o2.getFirst(), o1.getFirst()) : org.apache.hadoop.hbase.util.Bytes.compareTo(o1.getFirst(), o2.getFirst());
}