private void reindexFolders(java.lang.String index) throws de.mpg.imeji.exceptions.ImejiException {
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Indexing Folders...");
    de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer indexer = new de.mpg.imeji.logic.search.elasticsearch.ElasticIndexer(index, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ElasticTypes.folders, de.mpg.imeji.logic.search.elasticsearch.ElasticService.ANALYSER);
    de.mpg.imeji.logic.controller.resource.CollectionController c = new de.mpg.imeji.logic.controller.resource.CollectionController();
    java.util.List<de.mpg.imeji.logic.vo.CollectionImeji> collections = ((java.util.List<de.mpg.imeji.logic.vo.CollectionImeji>) (c.retrieveAll(Imeji.adminUser)));
    indexer.indexBatch(collections);
    indexer.commit();
    de.mpg.imeji.logic.jobs.ElasticReIndexJob.LOGGER.info("Folders reindexed!");
}