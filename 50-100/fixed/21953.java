@java.lang.Override
public void writeTo(final org.elasticsearch.common.io.stream.StreamOutput out) throws java.io.IOException {
    out.writeString(cpuAcctControlGroup);
    out.writeLong(cpuAcctUsageNanos);
    out.writeString(cpuControlGroup);
    out.writeLong(cpuCfsPeriodMicros);
    out.writeLong(cpuCfsQuotaMicros);
    cpuStat.writeTo(out);
}