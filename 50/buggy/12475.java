@java.lang.Override
public org.apache.flink.types.DoubleValue map(org.apache.flink.api.java.tuple.Tuple2<T, org.apache.flink.types.DoubleValue> value) throws java.lang.Exception {
    double val = value.f1.getValue();
    output.setValue((val * val));
    return output;
}