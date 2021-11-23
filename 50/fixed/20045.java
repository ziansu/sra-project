private void addAllMappings(java.lang.String index) {
    for (de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes type : de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes.values()) {
        new de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer(index, type, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ANALYSER).addMapping();
    }
}