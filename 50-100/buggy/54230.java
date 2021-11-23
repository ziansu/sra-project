@javax.annotation.Nullable
@java.lang.Override
public co.cask.cdap.api.dataset.table.Row apply(org.apache.hadoop.hbase.client.Result result) {
    java.util.Map<byte[], byte[]> familyMap = result.getFamilyMap(columnFamily);
    return new org.apache.hadoop.hbase.client.Result(result.getRow(), (familyMap != null ? familyMap : com.google.common.collect.ImmutableMap.<byte[], byte[]>of()));
}