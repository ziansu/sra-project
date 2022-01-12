private void reindexSpaces(java.lang.String index) throws de.mpg.imeji.exceptions.ImejiException {
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Indexing Spaces...");
    de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer indexer = new de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer(index, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes.spaces, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ANALYSER);
    de.mpg.imeji.logic.controller.resource.SpaceController controller = new de.mpg.imeji.logic.controller.resource.SpaceController();
    java.util.List<de.mpg.imeji.logic.vo.Space> items = controller.retrieveAll();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info((("+++ " + (items.size())) + " items to index +++"));
    indexer.indexBatch(items);
    indexer.commit();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Spaces reindexed!");
}