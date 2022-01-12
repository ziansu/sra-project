@java.lang.Override
public R map(T inTuple) throws java.lang.Exception {
    for (int i = 0; i < (fields.length); i++) {
        outTuple.setField(((org.apache.flink.api.java.tuple.Tuple) (inTuple)).getField(fields[i]), i);
    }
    return outTuple;
}