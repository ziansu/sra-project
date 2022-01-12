public static org.apache.drill.common.expression.SchemaPath getCompoundPath(java.lang.String... strings) {
    java.util.List<java.lang.String> paths = java.util.Arrays.asList(strings);
    java.util.Collections.reverse(paths);
    org.apache.drill.common.expression.PathSegment.NameSegment s = null;
    for (java.lang.String p : paths) {
        s = new org.apache.drill.common.expression.PathSegment.NameSegment(p, s);
    }
    return new org.apache.drill.common.expression.SchemaPath(s);
}