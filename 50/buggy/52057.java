@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteById(java.lang.Object id) {
    elasticSearchService.deleteById(org.molgenis.data.elasticsearch.util.ElasticsearchEntityUtils.toElasticsearchId(id), getEntityMetaData());
    elasticSearchService.refresh();
}