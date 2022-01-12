public static org.spine3.client.Query readByIds(java.lang.Class<? extends com.google.protobuf.Message> entityClass, java.util.Set<? extends com.google.protobuf.Message> ids, java.lang.String... paths) {
    final com.google.protobuf.FieldMask fieldMask = (paths != null) ? com.google.protobuf.FieldMask.newBuilder().addAllPaths(java.util.Arrays.asList(paths)).build() : null;
    final org.spine3.client.Query result = org.spine3.base.Queries.composeQuery(entityClass, ids, fieldMask);
    return result;
}