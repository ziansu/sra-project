@javax.annotation.Nullable
@java.lang.Override
public java.util.Map<byte[], byte[]> apply(org.apache.hadoop.hbase.client.Result result) {
    java.util.Map<byte[], byte[]> familyMap = result.getFamilyMap(columnFamily);
    return familyMap != null ? familyMap : com.google.common.collect.ImmutableMap.<byte[], byte[]>of();
}