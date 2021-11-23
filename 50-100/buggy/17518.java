private static org.spine3.client.EntityFilters toEntityFilters(org.spine3.server.event.EventStreamQuery query) {
    final org.spine3.client.EntityFilters.Builder builder = org.spine3.client.EntityFilters.newBuilder();
    if (query.hasAfter()) {
        final com.google.protobuf.Timestamp timestamp = query.getAfter();
        final com.google.protobuf.Any wrappedTimestamp = org.spine3.protobuf.AnyPacker.pack(timestamp);
        final org.spine3.client.ColumnFilter filter = org.spine3.client.ColumnFilters.gt(org.spine3.server.event.EventEntity.CREATED_TIME_COLUMN, wrappedTimestamp);
        builder.addColumnFilter(filter);
    }
    final org.spine3.client.EntityFilters entityFilters = builder.build();
    return entityFilters;
}