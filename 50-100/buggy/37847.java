public org.apache.usergrid.corepersistence.pipeline.builder.IdBuilder traverseReverseConnection(final java.lang.String connectionName, final com.google.common.base.Optional<java.lang.String> entityType) {
    final org.apache.usergrid.corepersistence.pipeline.PipelineOperation<org.apache.usergrid.corepersistence.pipeline.read.FilterResult<org.apache.usergrid.persistence.model.entity.Id>, org.apache.usergrid.corepersistence.pipeline.read.FilterResult<org.apache.usergrid.persistence.model.entity.Id>> filter;
    if (entityType.isPresent()) {
        filter = filterFactory.readGraphConnectionByTypeFilter(connectionName, entityType.get());
    }else {
        filter = filterFactory.readGraphReverseConnectionFilter(connectionName);
    }
    return new org.apache.usergrid.corepersistence.pipeline.builder.IdBuilder(pipeline.withFilter(filter), filterFactory);
}