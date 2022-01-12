@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteById(java.lang.Iterable<java.lang.Object> ids) {
    elasticSearchService.deleteById(org.molgenis.data.elasticsearch.util.ElasticsearchEntityUtils.toElasticsearchIds(ids), getEntityMetaData());
    elasticSearchService.refresh(getEntityMetaData());
}