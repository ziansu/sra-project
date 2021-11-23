private static java.util.List<org.apache.hadoop.hbase.KeyValue> getSortedRowMapping(org.apache.hadoop.hbase.client.Result row) throws java.io.IOException {
    java.util.List<org.apache.hadoop.hbase.KeyValue> map = new java.util.ArrayList<org.apache.hadoop.hbase.KeyValue>();
    for (org.apache.hadoop.hbase.Cell c : row.listCells()) {
        map.add(new org.apache.hadoop.hbase.KeyValue(c));
    }
    return map;
}