@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void deleteAll() {
    elasticSearchService.delete(getEntityMetaData().getName());
    createMappings();
    elasticSearchService.refresh();
}