@java.lang.Override
public java.lang.Iterable<java.lang.String> call(java.lang.String x) {
    return com.google.common.collect.Lists.newArrayList(com.aliyun.emr.example.JavaMNSWordCount.SPACE.split(x));
}