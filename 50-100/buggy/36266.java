@java.lang.Override
public int compare(org.apache.hadoop.hbase.util.Pair<byte[], org.apache.hadoop.hbase.util.Pair<byte[], byte[]>> o1, org.apache.hadoop.hbase.util.Pair<byte[], org.apache.hadoop.hbase.util.Pair<byte[], byte[]>> o2) {
    int compare = org.apache.hadoop.hbase.util.Bytes.compareTo(o1.getFirst(), o2.getFirst());
    if (!(isReversed())) {
        return compare;
    }else {
        return -compare;
    }
}