@java.lang.Override
public java.lang.String format(org.apache.flink.api.java.tuple.Tuple2<java.lang.Long, java.util.ArrayList<java.lang.String>> value) {
    java.lang.String s = ("{\"group\": " + (value.f0)) + ", \"member\": [";
    boolean first = true;
    for (java.lang.String word : value.f1) {
        if (first) {
            first = false;
            s += ("\"" + word) + "\"";
        }else {
            s += (",\"" + word) + "\"";
        }
    }
    s += "]}";
    return s;
}