@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void delete(java.lang.Iterable<? extends org.molgenis.data.Entity> entities) {
    elasticSearchService.delete(entities, getEntityMetaData());
    elasticSearchService.refresh(getEntityMetaData());
}