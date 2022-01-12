@java.lang.Override
public org.elasticsearch.common.xcontent.XContentBuilder toXContent(org.elasticsearch.common.xcontent.XContentBuilder builder, org.elasticsearch.monitor.os.Params params) throws java.io.IOException {
    builder.startObject(org.elasticsearch.monitor.os.OsStats.Fields.OS);
    builder.field(org.elasticsearch.monitor.os.OsStats.Fields.TIMESTAMP, getTimestamp());
    cpu.toXContent(builder, params);
    mem.toXContent(builder, params);
    swap.toXContent(builder, params);
    cgroup.toXContent(builder, params);
    builder.endObject();
    return builder;
}