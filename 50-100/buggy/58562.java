@java.lang.Override
protected void dispatchToEntity(I id, com.google.protobuf.Message eventMessage, org.spine3.base.EventContext context) {
    final P projection = org.spine3.server.projection.ProjectionRepository.loadOrCreate(id);
    projection.handle(eventMessage, context);
    store(projection);
    final com.google.protobuf.Timestamp eventTime = context.getTimestamp();
    if (isBulkWriteInProgress()) {
        storePostponed(projection, eventTime);
    }else {
        storeNow(projection, eventTime);
    }
    standFunnel.post(projection);
}