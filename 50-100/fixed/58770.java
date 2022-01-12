public static Put rowOf(java.lang.String rowId, java.lang.String hero, java.lang.String power, java.lang.String name, java.lang.String xp) {
    Put put = new Put(org.apache.hadoop.hbase.util.Bytes.toBytes(rowId));
    put.add(org.apache.hadoop.hbase.util.Bytes.toBytes(SuperTable.COLUMNFAMILIY_PERSONAL), org.apache.hadoop.hbase.util.Bytes.toBytes(hero), org.apache.hadoop.hbase.util.Bytes.toBytes(power));
    put.add(org.apache.hadoop.hbase.util.Bytes.toBytes(SuperTable.COLUMNFAMILIY_PROFESSIONAL), org.apache.hadoop.hbase.util.Bytes.toBytes(name), org.apache.hadoop.hbase.util.Bytes.toBytes(xp));
    return put;
}