private void createMappings() {
    elasticSearchService.createMappings(getEntityMetaData());
}