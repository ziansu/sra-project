@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public R map(org.apache.flink.api.java.tuple.Tuple inTuple) throws java.lang.Exception {
    for (int i = 0; i < (fields.length); i++) {
        outTuple.setField(inTuple.getField(fields[i]), i);
    }
    return ((R) (outTuple));
}