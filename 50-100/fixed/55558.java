@java.lang.Override
public org.apache.flink.graph.Edge<java.lang.Long, org.apache.flink.types.NullValue> map(java.lang.String s) throws java.lang.Exception {
    java.lang.String[] args = s.split("\t");
    long src = java.lang.Long.parseLong(args[0]);
    long trg = (java.lang.Long.parseLong(args[1])) + 1000000;
    return new org.apache.flink.graph.Edge(src, trg, org.apache.flink.types.NullValue.getInstance());
}