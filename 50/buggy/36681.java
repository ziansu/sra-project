@java.lang.Override
public int compare(org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.Long> o1, org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.Long> o2) {
    return org.apache.flink.api.java.utils.DataSetUtils.compareInts(o1.f0, o2.f0);
}