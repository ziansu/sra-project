@java.lang.Override
public java.lang.Iterable<java.util.List<java.lang.Object>> deserialize(byte[] rawValue) {
    byte[] value = org.apache.metron.spout.pcap.PcapHelper.headerizeIfNecessary(rawValue);
    java.lang.Long ts = org.apache.metron.spout.pcap.scheme.FromPacketScheme.getTimestamp(value);
    if (ts != null) {
        return com.google.common.collect.ImmutableList.of(new backtype.storm.tuple.Values(com.google.common.collect.ImmutableList.of(new org.apache.hadoop.io.LongWritable(ts), new org.apache.hadoop.io.BytesWritable(rawValue))));
    }else {
        return com.google.common.collect.ImmutableList.of(new backtype.storm.tuple.Values(java.util.Collections.EMPTY_LIST));
    }
}