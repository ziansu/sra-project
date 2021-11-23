@java.lang.Override
public long compare(org.apache.jmeter.report.core.Sample s1, org.apache.jmeter.report.core.Sample s2) {
    return java.lang.Long.compare(s1.getData(long.class, index), s2.getData(long.class, index));
}