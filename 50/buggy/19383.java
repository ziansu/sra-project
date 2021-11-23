public static void shutdown() {
    de.mpg.imeji.logic.search.elasticsearch.ElasticInitializer.LOGGER.warn("SHUTTING DOWN ELASTICSEARCH...");
    de.mpg.imeji.logic.search.elasticsearch.ElasticService.getNODE().close();
    de.mpg.imeji.logic.search.elasticsearch.ElasticInitializer.LOGGER.warn("... DONE!");
}