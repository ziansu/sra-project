@java.lang.Override
public void flatMap(java.lang.String value, org.apache.flink.util.Collector<org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Integer>> out) throws java.lang.Exception {
    java.lang.String[] tokens = value.toLowerCase().split("\\W+");
    for (java.lang.String token : tokens) {
        if ((token.length()) > 0) {
            out.collect(new org.apache.flink.api.java.tuple.Tuple2<java.lang.String, java.lang.Integer>(token, 1));
        }
    }
}