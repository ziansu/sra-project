public static org.spine3.client.Query readAll(java.lang.Class<? extends com.google.protobuf.Message> entityClass, java.lang.String... paths) {
    final com.google.protobuf.FieldMask fieldMask = (paths != null) ? com.google.protobuf.FieldMask.newBuilder().addAllPaths(com.sun.tools.javac.util.List.from(paths)).build() : null;
    final org.spine3.client.Query result = org.spine3.base.Queries.composeQuery(entityClass, null, fieldMask);
    return result;
}