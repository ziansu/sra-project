private static org.spine3.client.EntityFilters toEntityFilters(org.spine3.server.event.EventStreamQuery query) {
    final org.spine3.client.EntityFilters.Builder builder = org.spine3.client.EntityFilters.newBuilder();
    if (query.hasAfter()) {
        final com.google.protobuf.Timestamp timestamp = query.getAfter();
        final org.spine3.client.ColumnFilter filter = org.spine3.client.ColumnFilters.gt(org.spine3.server.event.EventEntity.CREATED_TIME_COLUMN, timestamp);
        builder.addColumnFilter(filter);
    }
    final org.spine3.client.EntityFilters entityFilters = builder.build();
    return entityFilters;
}