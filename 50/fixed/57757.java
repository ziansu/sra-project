@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.lang.Integer add(java.lang.Iterable<? extends org.molgenis.data.Entity> entities) {
    long nrIndexedEntities = elasticSearchService.index(entities, getEntityMetaData(), IndexingMode.ADD);
    elasticSearchService.refresh(getEntityMetaData());
    return org.elasticsearch.common.primitives.Ints.checkedCast(nrIndexedEntities);
}